package com.base.day5.ReservationDemo;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        ReservationController rc = new ReservationController();
        //设置用户
        Customer c1 = new Customer("顾客A", "A123456");
        Customer c2 = new Customer("顾客B", "A123456");
        //设置车子
        Car car1 = new Car("C1", c1, new Date());
        Car car2 = new Car("C2", c2, new Date());
        Car car3 = new Car("C3", c1, new Date());
        //设置预约
        Reservation r1 = new Reservation(car1, new Date(2019 - 1900, 6, 11, 15, 00, 0));
        Reservation r2 = new Reservation(car2, new Date(2019 - 1900, 6, 14, 12, 00, 0));
        Reservation r3 = new Reservation(car3, new Date(2019 - 1900, 6, 12, 11, 00, 0));
        //写入预约信息
        rc.setReservation(r1);
        rc.setReservation(r2);
        rc.setReservation(r3);

    }
}
