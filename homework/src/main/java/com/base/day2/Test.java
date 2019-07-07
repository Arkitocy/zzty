package com.base.day2;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Animal("猫","cat","红色",3.5);
        Animal chick = new Animal("鸡","chicken","黄色",10);
        Animal bird = new Animal("鸟","bird","黑色",1.5);
        cat.eat();
        cat.run();
        cat.scream();
        chick.scream();
        chick.run();
        chick.eat();
        bird.eat();
        bird.run();
        bird.scream();
    }
}
