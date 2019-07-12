package com.base.day5.Student;

import sun.font.TrueTypeFont;

import java.util.ArrayList;

public class Student {
    private String name;
    private int number;
    private int age;
    private int rankscore;
    private ArrayList<Teacher> teachers = new ArrayList<>();


    public Student(String name, int number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    public int getRankscore() {
        return rankscore;
    }

    public void setRankscore(int rankscore) {
        this.rankscore = rankscore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public boolean setTeachers(Teacher teacher) {
        boolean rs = false;
        if (teacher != null) {
            teachers.add(teacher);
            rs = true;
        }
        return rs;
    }

    public Teacher getTeacher(int tNo) {
        Teacher t = new Teacher();
        for (int i = 0; i < teachers.size(); i++) {
            if (tNo == teachers.get(i).getNo()) {
                t = teachers.get(i);
            }
        }
        return t;
    }
}
