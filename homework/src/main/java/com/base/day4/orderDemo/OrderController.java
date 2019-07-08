package com.base.day4.orderDemo;


import java.util.ArrayList;

public class OrderController {
    ArrayList orderArrayList = new ArrayList();

    public boolean showOrder(String name) {
        boolean result = false;
        for (int i = 0; i < orderArrayList.size(); i++) {
            Order order = (Order) orderArrayList.get(i);
            if (name.equals(order.getCustomer())) {
                result = true;
                order.showOrder();
            }
        }
        if (!result) {
            System.out.println("No Order");
        }
        return result;
    }

    public Order setOrder(String customer, int num, double price) {
        Order order = new Order(customer, num, price);
        orderArrayList.add(order);
        return order;
    }
}
