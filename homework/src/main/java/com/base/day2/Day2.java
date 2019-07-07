package com.base.day2;

public class Day2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "white";
        car1.category = "bmw";
        Car car2 = new Car();
        car2.setColor("black");
        car2.setCategory("benz");
//        car.setCategory("bmw");
//        car.setColor("white");
        car1.run();
        car2.run();

    }
}
