package com.exlibrisrares.controller;

import com.exlibrisrares.model.Categorie;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/categories")
public class CategorieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        // Liste fictive de catégories (plus tard on les chargera depuis la BD)
        List<Categorie> categories = new ArrayList<>();
        categories.add(new Categorie(1, "Romans anciens"));
        categories.add(new Categorie(2, "Sciences et techniques"));
        categories.add(new Categorie(3, "Philosophie"));
        categories.add(new Categorie(4, "Livres illustrés"));

        // Attacher la liste à la requête
        request.setAttribute("categories", categories);

        // Rediriger vers la vue
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/categories.jsp");
        dispatcher.forward(request, response);
    }
}
