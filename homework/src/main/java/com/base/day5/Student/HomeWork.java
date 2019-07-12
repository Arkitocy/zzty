package com.base.day5.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeWork {
    private int wNo;
    private Student student;
    private Date finishDate;
    private Date uploadDate = null;
    private int score = 0;
    private String rank = null;
    private String content;//无文件使用 以string代替
    private String comment;//评语
    private int tNo;//批改老师编号
    SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分");


    public HomeWork() {

    }

    public HomeWork(int wNo, Student student, String content) {
        this.wNo = wNo;
        this.student = student;
        this.finishDate = new Date();
        this.content = content;
    }

    public int gettNo() {
        return tNo;
    }

    public void settNo(int tNo) {
        this.tNo = tNo;
    }

    public int getwNo() {
        return wNo;
    }

    public void setwNo(int wNo) {
        this.wNo = wNo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
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
        System.out.println("----------");
        System.out.println(this.getStudent().getName() + "提交作业");
        System.out.println("完成时间：" + sf.format(this.getFinishDate()));
        System.out.println("提交时间：" + sf.format(this.getUploadDate()));
        System.out.println("分数:" + this.getScore());
        System.out.println("等第：" + this.getRank());
        System.out.println("批改教师编号：" + this.gettNo());

    }
}
