package com.example.ConsoleProject;

import com.example.ConsoleProject.Tour.Tour;

import java.util.List;

public class Singe {
    private String nom;
    private final List<Tour> tours;

    public Singe(List<Tour> tours) {
        this.tours = tours;
    }

    public String getNom() {
        return nom;
    }


    public List<Tour> getTours() {
        return tours;
    }
}
