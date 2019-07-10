package com.base.day5.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeWork {
    private Student student;
    private Date finishDate;
    private Date uploadDate;
    private int score = 0;
    private String content;//无文件使用 以string代替
    SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分");


    public HomeWork(Student student, String content) {
        this.student = student;
        this.finishDate = new Date();
        this.content = content;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void show() {
        System.out.println(this.getStudent().getName() + "提交作业");
        System.out.println("完成时间：" + sf.format(this.getFinishDate()));
        System.out.println("提交时间：" + sf.format(this.getUploadDate()));
        System.out.println("成绩" + this.getScore());
    }
}
