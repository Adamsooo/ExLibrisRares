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

        List<Categorie> categories = new ArrayList<>();
        categories.add(new Categorie(1, "Romans anciens"));
        categories.add(new Categorie(2, "Sciences et techniques"));
        categories.add(new Categorie(3, "Philosophie"));
        categories.add(new Categorie(4, "Livres illustrés"));

        request.setAttribute("categories", categories);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/categories.jsp");
        dispatcher.forward(request, response);
    }
}
