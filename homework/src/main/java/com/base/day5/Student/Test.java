package com.base.day5.Student;

import java.io.File;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        HomeWorkController hc = new HomeWorkController();
        Student s1 = new Student("A", 1, 20);
        Student s2 = new Student("B", 2, 20);
        Teacher t1 = new Teacher("teacher1", 1);
        Teacher t2 = new Teacher("teacher2", 2);
        hc.regist(s1);
        hc.regist(s2);
        hc.regist(t1);
        hc.regist(t2);
        hc.setTeacher(s1.getName(), t1.getName());
        hc.setTeacher(s1.getName(), t2.getName());
        hc.setTeacher(s2.getName(), t2.getName());
        HomeWork hw1 = new HomeWork(1, s1, "homework1");
        HomeWork hw2 = new HomeWork(2, s1, "homework2");
        HomeWork hw3 = new HomeWork(3, s2, "homework2");
        hc.upload(hw1);
        hc.upload(hw2);
        hc.upload(hw3);
        //hw1-s1-A
        //hw2-s1-D
        //hw3-s2-B
        hc.setScore(t1.getNo(), hw1.getwNo(), 70);
        hc.setScore(t2.getNo(), hw2.getwNo(), 95);
        hc.setScore(t2.getNo(), hw3.getwNo(), 85);


        hc.setRank(t1.getNo(), hw1.getwNo());
        hc.setRank(t2.getNo(), hw3.getwNo());
        hc.setRank(t1.getNo(), hw2.getwNo());
        hc.setComment(t1.getNo(), hw1.getwNo(), "A等级");
        hc.getHomework(hw1.getwNo()).show();
        hc.getHomework(hw2.getwNo()).show();
        hc.getHomework(hw3.getwNo()).show();
        System.out.println("学生作业总等级分" + hc.setRankScore("A"));
        System.out.println("学生作业总等级分" + hc.setRankScore("B"));
        hc.showRank();


    }
}
