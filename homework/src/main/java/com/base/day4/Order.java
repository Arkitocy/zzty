package com.base.day4;

public class Order {
    private String customer;
    private int num;
    private double price;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order(String customer, int num, double price) {
        this.setCustomer(customer);
        this.setNum(num);
        this.setPrice(price);
    }

    public void showOrder() {
        System.out.println(this.getCustomer() + "点了" + this.getNum() + "个菜，花费" + this.getPrice()+"元。");
    }
}
