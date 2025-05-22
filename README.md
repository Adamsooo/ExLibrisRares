# Ex Libris Rares 

> Application web de vente de livres rares.  
> Ce projet respecte l'architecture **MVC 2** et utilise les technologies Java EE.


## 🎯 Objectifs pédagogiques

- Mettre en œuvre un site dynamique avec JEE
- Appliquer le modèle MVC2 dans une architecture modulaire
- Utiliser les Servlets, JSP, sessions, et JDBC
- Structurer un projet déployable sur Tomcat
- Gérer un dépôt Git avec GitHub (livrables, historique, README)

---

## 🧱 Technologies utilisées

- Java EE (Servlets, JSP, JDBC)
- Apache Tomcat 10.0
- MySQL / phpMyAdmin
- HTML / CSS
- UML (StarUML, Draw.io)
- Git / GitHub
- Eclipse EE

---

## 🧩 Fonctionnalités réalisées

| Fonction                       | Statut   |
|-------------------------------|----------|
| Architecture MVC2             | ✅       |
| Navigation par catégories     | ✅       |
| Affichage dynamique des livres| ✅       |
| Panier (ajout + affichage)    | ✅       |
| Vider le panier               | ✅       |
| DAO `CategorieDAO` opérationnel| ✅       |
| Connexion à la base de données| 🔜 En cours |
| Validation de commande        | 🔜 À venir |
| Authentification client       | 🔜 À venir |

---

## 🗂 Structure du projet

```plaintext
ExLibrisRares/
├── src/
│   └── com.exlibrisrares.controller/   → Servlets (Accueil, Catégories, Livres, Panier)
│   └── com.exlibrisrares.model/        → Modèles (Categorie, Livre, Panier)
│   └── com.exlibrisrares.dao/          → DAO (CategorieDAO)
├── WebContent/
│   ├── index.jsp                       → Page d'accueil
│   ├── jsp/
│   │   ├── categories.jsp              → Liste des catégories
│   │   ├── livres.jsp                  → Liste des livres d’une catégorie
│   │   └── panier.jsp                  → Panier d’achat
│   ├── css/                            → Feuilles de style (optionnel)
│   └── WEB-INF/
│       └── web.xml                     → Descripteur de déploiement
├── sql/
│   └── create_db.sql                  → Script de création de la BDD
├── README.md
```

## 🧪 Installation et exécution

1. Cloner le projet: git clone https://github.com/adamsooo/ex-libris-rares.git
2. Importer dans Eclipse Fichier > Import > Dynamic Web Project > Sélectionner le dossier

3. Configurer Apache Tomcat 10.0
Dans Eclipse : Servers > Add > Tomcat v10.0 > Sélectionner répertoire Tomcat

4. Créer la base de données
Ouvrir phpMyAdmin ou MySQL Workbench

Exécuter le script sql/create_db.sql

5. Lancer l'application
Run on Server depuis Eclipse

6. Accéder à l'application: http://localhost:8080/ExLibrisRares/

## 📝 Auteur
- Nom : Adams OUEDRAOGO
- Formation : E5 INF
- Université : ESIEE Paris
