package com.base.day4;

public class User {
    private int id;
    private String name;
    private String pwd;
    private String email;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(int id, String name, String pwd, String email, String phone) {
        this.setId(id);
        this.setName(name);
        this.setPwd(pwd);
        this.setEmail(email);
        this.setPhone(phone);
    }


    public User(int id, String name, String pwd) {
        this.setId(id);
        this.setName(name);
        this.setPwd(pwd);
    }

    public void showInfo(){
        System.out.println("ID:"+this.getId() + " Name:" + this.getName() + " Password:" + this.getPwd());
    }

}
