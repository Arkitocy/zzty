package com.base.day2;


public class Animal {
    private String color;
    private String name;
    private String species;
    private double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal(String name, String species, String color, double weight) {
        this.setName(name);
        this.setSpecies(species);
        this.setColor(color);
        this.setWeight(weight);
    }

    public void scream() {
        System.out.println(this.getColor() + "的" + this.getName() + " (" + this.getSpecies() + ") " + "叫");
    }

    public void run() {
        System.out.println(this.getColor() + "的" + this.getName() + " (" + this.getSpecies() + ") " + "跑");
    }

    public void eat() {
        System.out.println(this.getColor() + "的" + this.getName() + " (" + this.getSpecies() + ") " + "吃");
    }
}
