# Ex Libris Rares – Mini-projet JEE e-commerce

Ce projet est une application web de vente en ligne de livres rares et anciens, développée dans le cadre du module FAE 2025. L'application repose sur les technologies Java EE (JEE) et respecte l'architecture MVC 2.

## 📚 Contexte

*Ex Libris Rares* est un site fictif permettant aux passionnés de bibliophilie d'acheter des ouvrages rares, classés par catégories. Le client peut consulter les produits, les ajouter à un panier virtuel, modifier sa commande, et finaliser l’achat après authentification. Les données sont stockées dans une base de données relationnelle.

## 🧱 Technologies utilisées

- Java EE (Servlets, JSP, JDBC)
- Apache Tomcat
- MySQL
- HTML / CSS (Bootstrap)
- UML (StarUML, Draw.io)
- Git / GitHub

## 🗺️ Fonctionnalités principales

- Navigation par catégories
- Affichage des livres avec descriptions détaillées
- Ajout au panier, modification des quantités, suppression
- Connexion client
- Validation de commande avec enregistrement BD
- Interface simple et intuitive

## 🗂 Structure du projet


ExLibrisRares/
├── src/
│   └── com.exlibrisrares.controller/   → Servlets (Accueil, Catégories, Livres, Panier)
│   └── com.exlibrisrares.model/        → Modèles (Categorie, Livre, Panier)
│   └── com.exlibrisrares.dao/          → DAO (CategorieDAO) ← à venir
├── WebContent/
│   ├── index.jsp                       → Page d'accueil
│   ├── jsp/
│   │   ├── categories.jsp              → Liste des catégories
│   │   ├── livres.jsp                  → Liste des livres d’une catégorie
│   │   └── panier.jsp                  → Panier d’achat
│   ├── css/                            → (optionnel)
│   └── WEB-INF/
│       └── web.xml                    → Descripteur de déploiement



## 🧪 Installation et exécution

1. Cloner le projet :git clone https://github.com/adamsooo/ex-libris-rares.git
2. Importer le projet dans Eclipse (Dynamic Web Project)
3. Configurer le serveur Apache Tomcat
4. Créer la base de données via `/sql/create_db.sql`
5. Lancer l'application : [http://localhost:8080/ExLibrisRares](http://localhost:8080/ExLibrisRares)

## 📝 Auteur

- Nom : Adams OUEDRAOGO
- Formation : E5 INF
- Université : ESIEE Paris
