package com.exlibrisrares.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/accueil")
public class AccueilServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        // Redirige vers la page d'accueil JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/index.jsp");
        dispatcher.forward(request, response);
    }
}