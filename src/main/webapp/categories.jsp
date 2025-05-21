<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*, com.exlibrisrares.model.Categorie" %>
<html>
<head>
    <title>Catégories</title>
</head>
<body>
    <h2>Nos catégories de livres rares</h2>
    <ul>
        <%
            List<Categorie> categories = (List<Categorie>) request.getAttribute("categories");
            for (Categorie cat : categories) {
        %>
            <li><a href="#"><%= cat.getNom() %></a></li>
        <%
            }
        %>
    </ul>
</body>
</html>
