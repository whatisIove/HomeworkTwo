package com.company;

public class CountryTest {
    public static void main(String[] args) {
        Country myCountry = new Country();
        myCountry.name = "Ukraine";
        myCountry.capital = "Kiev";
        myCountry.square = 637000;
        myCountry.population = 41167336;

        System.out.println("\nMy Country info:");
        System.out.println("Title: " + myCountry.name);
        System.out.println("Capital: " + myCountry.capital);
        System.out.println("Square km2: " + myCountry.square);
        System.out.println("Population: " + myCountry.population);

        Country friendCountry = new Country();
        friendCountry.name = "Austria";
        friendCountry.capital = "Vienna";
        friendCountry.square = 83879;
        friendCountry.population = 9027999;

        System.out.println("\nFriend Country info:");
        System.out.println("Title: " + friendCountry.name);
        System.out.println("Capital: " + friendCountry.capital);
        System.out.println("Square km2: " + friendCountry.square);
        System.out.println("Population: " + friendCountry.population);

        Country parentsCountry = new Country();
        parentsCountry.name = "Germany";
        parentsCountry.capital = "Berlin";
        parentsCountry.square = 357578;
        parentsCountry.population = 83155031;

        System.out.println("\nParents Country info:");
        System.out.println("Title: " + parentsCountry.name);
        System.out.println("Capital: " + parentsCountry.capital);
        System.out.println("Square km2: " + parentsCountry.square);
        System.out.println("Population: " + parentsCountry.population);

    }
}
