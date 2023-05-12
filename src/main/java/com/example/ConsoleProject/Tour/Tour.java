package com.example.ConsoleProject.Tour;


public class Tour {
    private final String nom;
    private final TypeTour type;
    private final  String index;

    public Tour(String index,String nom, TypeTour type) {
        this.nom = nom;
        this.index= index;
        this.type = type;
    }

    public String getIndex() {
        return index;
    }

    public String getNom() {
        return nom;
    }

    public TypeTour getType() {
        return type;
    }
}
