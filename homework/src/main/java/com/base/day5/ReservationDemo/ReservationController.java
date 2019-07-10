package com.base.day5.ReservationDemo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ReservationController {
    ArrayList arrayList = new ArrayList();
    SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分");

    public boolean setReservation(Reservation reservation) {
        arrayList.add(reservation);
        showReservation(reservation.getCar().getCustomer());
        return true;

    }

    public void showReservation(Customer customer) {
        for (int i = 0; i < arrayList.size(); i++) {
            Reservation reservation = (Reservation) arrayList.get(i);
            if (customer.equals(reservation.getCar().getCustomer())) {
                System.out.println("顾客" + reservation.getCar().getCustomer().getName() + "的车" + reservation.getCar().getCarId() + "预约在" + sf.format(reservation.getReservationDate()) + "服务。预约时间：" + sf.format(reservation.getSetDate()));
            }
        }
    }

}
