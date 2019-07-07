package com.base.day2;

public class Car {
    String category;
    String color;

    void run() {
        System.out.println("drive " + this.getColor() + " " + this.getCategory());
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
