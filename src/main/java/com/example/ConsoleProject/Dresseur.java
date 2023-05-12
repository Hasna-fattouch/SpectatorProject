package com.example.ConsoleProject;

import com.example.ConsoleProject.Tour.Tour;
import com.example.ConsoleProject.Tour.TypeTour;

import java.util.Arrays;

public class Dresseur {
    private final Singe singe;

    public Dresseur() {
        this.singe = new Singe(Arrays.asList(
                new Tour("1","marcher sur les mains", TypeTour.ACROBATIE),
                new Tour("2","jouer par la guitare", TypeTour.MUSIQUE),
                new Tour("3","marcher sur les mains", TypeTour.ACROBATIE)));
    }

    public Singe getSinge() {
        return singe;
    }
}
