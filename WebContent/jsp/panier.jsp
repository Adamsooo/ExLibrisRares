<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*, com.exlibrisrares.model.Livre, com.exlibrisrares.model.Panier" %>
<html>
<head>
    <title>Panier</title>
</head>
<body>
    <h2>Votre panier</h2>
    <%
        Panier panier = (Panier) request.getAttribute("panier");
        if (panier != null && !panier.getArticles().isEmpty()) {
    %>
        <ul>
        <%
            for (Livre livre : panier.getArticles()) {
        %>
            <li><%= livre.getTitre() %> - <%= livre.getPrix() %> €</li>
        <%
            }
        %>
        </ul>
        <p><strong>Total :</strong> <%= panier.getTotal() %> €</p>
    <%
        } else {
    %>
        <p>Votre panier est vide.</p>
    <%
        }
    %>
</body>
</html>
