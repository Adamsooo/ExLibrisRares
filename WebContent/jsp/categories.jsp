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
            if (categories != null) {
                for (Categorie cat : categories) {
        %>
            <li>
                <a href="<%= request.getContextPath() %>/livres?cat=<%= cat.getId() %>">
                    <%= cat.getNom() %>
                </a>
            </li>
        <%
                }
            } else {
        %>
            <li>Aucune catégorie disponible.</li>
        <%
            }
        %>
    </ul>
</body>
</html>
