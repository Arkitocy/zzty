package com.base.day5.Student;

import java.util.ArrayList;
import java.util.Date;

public class HomeWorkController {
    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<HomeWork> homeworkList = new ArrayList<>();
    ArrayList<Teacher> teacherList = new ArrayList<>();

    public boolean regist(Student student) {
        studentList.add(student);
        return true;
    }

    public boolean regist(Teacher teacher) {
        teacherList.add(teacher);
        return true;
    }

    public Teacher getTeacher(String tName) {
        Teacher t = null;
        for (int i = 0; i < teacherList.size(); i++) {
            if (tName.equals(teacherList.get(i).getName())) {
                t = teacherList.get(i);
            }
        }
        return t;
    }


    public HomeWork getHomework(int wNo) {
        HomeWork hw = new HomeWork();
        for (int j = 0; j < homeworkList.size(); j++) {
            if (wNo == homeworkList.get(j).getwNo()) {
                hw = homeworkList.get(j);
            }
        }
        return hw;
    }

    public Student getStudent(String tName) {
        Student s = null;
        for (int i = 0; i < studentList.size(); i++) {
            if (tName.equals(studentList.get(i).getName())) {
                s = studentList.get(i);
            }
        }
        return s;
    }

    public void setTeacher(String sName, String tName) {
        for (int i = 0; i < studentList.size(); i++) {
            if (sName.equals(studentList.get(i).getName())) {
                studentList.get(i).setTeachers(this.getTeacher(tName));
            }
        }

    }

    public HomeWork upload(HomeWork work) {
        work.setUploadDate(new Date());
        homeworkList.add(work);
        return work;
    }

//    public void showWork(int number) {
//        for (int i = 0; i < homeworkList.size(); i++) {
//            HomeWork homeWork = (HomeWork) homeworkList.get(i);
//            if (number == homeWork.getStudent().getNumber()) {
//                homeWork.show();
//            }
//        }
//    }

    public void setScore(int tNo, int wNo, int score) {

        for (int j = 0; j < homeworkList.size(); j++) {
            if (wNo == homeworkList.get(j).getwNo()) {
                for (int i = 0; i < teacherList.size(); i++) {
                    if (tNo == homeworkList.get(j).getStudent().getTeacher(tNo).getNo()) {
                        homeworkList.get(j).setScore(score);
                        homeworkList.get(j).settNo(tNo);
                    }
                }
            }
        }

    }


    public void setRank(int tNo, int wNo) {
        String rank;


        for (int j = 0; j < homeworkList.size(); j++) {
            if (wNo == homeworkList.get(j).getwNo()) {
                for (int i = 0; i < teacherList.size(); i++) {
                    if (tNo == homeworkList.get(j).getStudent().getTeacher(tNo).getNo()) {
                        switch (homeworkList.get(j).getScore() / 10) {
                            case 10:
                            case 9:
                                rank = "A";
                                break;
                            case 8:
                                rank = "B";
                                break;
                            case 7:
                                rank = "C";
                                break;
                            case 6:
                                rank = "D";
                            default:
                                rank = "D";
                                break;

                        }

                        homeworkList.get(j).setRank(rank);
                        homeworkList.get(j).settNo(tNo);
                    }
                }

            }
        }


    }

    public void setComment(int tNo, int wNo, String comment) {

        for (int j = 0; j < homeworkList.size(); j++) {
            if (wNo == homeworkList.get(j).getwNo()) {
                for (int i = 0; i < teacherList.size(); i++) {
                    if (tNo == homeworkList.get(j).getStudent().getTeacher(tNo).getNo()) {
                        homeworkList.get(j).setComment(comment);
                        homeworkList.get(j).settNo(tNo);
                    }
                }
            }
        }
    }

    public int setRankScore(String sname) {

        int count = 0;
        for (int i = 0; i < homeworkList.size(); i++) {
            if (sname.equals(homeworkList.get(i).getStudent().getName())) {
                switch (homeworkList.get(i).getRank()) {
                    case "A":
                        count += 5;
                        break;
                    case "B":
                        count += 3;
                        break;
                    case "C":
                        count += -1;
                        break;
                    case "D":
                        count += -2;
                        break;
                }
            }
        }
        for (int j = 0; j < studentList.size(); j++) {
            if (sname.equals(studentList.get(j).getName())) {
                studentList.get(j).setRankscore(count);
            }
        }
        return count;
    }


    public static void sort(int[] a, String[] b) {
        //外层循环控制比较的次数
        for (int i = 0; i < a.length - 1; i++) {
            //内层循环控制到达位置
            for (int j = 0; j < a.length - i - 1; j++) {
                //前面的元素比后面小就交换
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    String temp2 = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp2;

                }
            }
        }
    }

    public void showRank() {
        int[] a = new int[studentList.size()];
        String[] b = new String[studentList.size()];
        for (int i = 0; i < studentList.size(); i++) {
            a[i] = studentList.get(i).getRankscore();
            b[i] = studentList.get(i).getName();
        }
        sort(a, b);
        for (int i = 0; i < a.length; i++) {
            System.out.println("第" + (i + 1) + "名是：" + b[i] + " 分数：" + a[i]);
        }
    }
}
