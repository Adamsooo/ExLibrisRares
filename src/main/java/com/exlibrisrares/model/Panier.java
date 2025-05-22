package com.exlibrisrares.model;

import java.util.*;

public class Panier {
    private List<Livre> articles;

    public Panier() {
        articles = new ArrayList<>();
    }

    public void ajouter(Livre livre) {
        articles.add(livre);
    }

    public List<Livre> getArticles() {
        return articles;
    }

    public double getTotal() {
        double total = 0.0;
        for (Livre l : articles) {
            total += l.getPrix();
        }
        return total;
    }

    public void vider() {
        articles.clear();
    }
    
}
