package com.base.day2;

public class SportsMan {
    int age;
    int height;
    String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    void race() {
        System.out.println("比赛");
    }

    void drive() {
        System.out.println("开车");
    }

    void eat() {
        System.out.println("吃饭");
    }
}
