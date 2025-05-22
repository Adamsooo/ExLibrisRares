package com.exlibrisrares.model;

public class Livre {
    private int id;
    private String titre;
    private String auteur;
    private String image;
    private double prix;
    private int categorieId;

    public Livre(int id, String titre, String auteur, String image, double prix, int categorieId) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.image = image;
        this.prix = prix;
        this.categorieId = categorieId;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getImage() {
        return image;
    }

    public double getPrix() {
        return prix;
    }

    public int getCategorieId() {
        return categorieId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
    }
}
