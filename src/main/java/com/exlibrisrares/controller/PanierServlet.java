package com.exlibrisrares.controller;

import com.exlibrisrares.model.Livre;
import com.exlibrisrares.model.Panier;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/panier")
public class PanierServlet extends HttpServlet {

    private List<Livre> tousLesLivres = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        // Simule une base de livres (réutilisé dans toutes les catégories)
        tousLesLivres.add(new Livre(1, "Les Misérables", "Victor Hugo", "", 25.00, 1));
        tousLesLivres.add(new Livre(2, "Le Comte de Monte-Cristo", "A. Dumas", "", 30.00, 1));
        tousLesLivres.add(new Livre(3, "Traité d’optique", "Newton", "", 90.00, 2));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        HttpSession session = request.getSession();
        Panier panier = (Panier) session.getAttribute("panier");

        if (panier == null) {
            panier = new Panier();
            session.setAttribute("panier", panier);
        }

        String idStr = request.getParameter("add");
        if (idStr != null) {
            int id = Integer.parseInt(idStr);
            for (Livre l : tousLesLivres) {
                if (l.getId() == id) {
                    panier.ajouter(l);
                    break;
                }
            }
        }

        request.setAttribute("panier", panier);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/panier.jsp");
        dispatcher.forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {

    	    HttpSession session = request.getSession();
    	    Panier panier = (Panier) session.getAttribute("panier");

    	    String action = request.getParameter("action");

    	    if (panier != null && "vider".equals(action)) {
    	        panier.vider();
    	    }

    	    request.setAttribute("panier", panier);
    	    RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/panier.jsp");
    	    dispatcher.forward(request, response);
    	}

}
