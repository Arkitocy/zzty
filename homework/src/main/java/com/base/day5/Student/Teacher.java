package com.base.day5.Student;

public class Teacher {
    private String name;
    private int no;

    public Teacher(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public Teacher() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
