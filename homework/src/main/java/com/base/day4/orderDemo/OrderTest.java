package com.base.day4.orderDemo;

public class OrderTest {
    public static void main(String[] args) {
        OrderController orderController = new OrderController();
        orderController.setOrder("小明",3,60);
        orderController.setOrder("小明",4,70);
        orderController.showOrder("小明");
        orderController.showOrder("小红");
    }
}
