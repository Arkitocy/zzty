package com.base.day5.ReservationDemo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ReservationController {
    ArrayList arrayList = new ArrayList(20);
    SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分");

    public boolean setReservation(Reservation reservation) {
        boolean rs = false;
        if (arrayList.size() > 20) {
            System.out.println("预约已满");
        } else {
            arrayList.add(reservation);
            showReservation(reservation.getCar().getCustomer());
            rs =true;
        }
        return rs;

    }

    public void showReservation(Customer customer) {
        for (int i = 0; i < arrayList.size(); i++) {
            Reservation reservation = (Reservation) arrayList.get(i);
            if (customer.equals(reservation.getCar().getCustomer())) {
                reservation.show();
            }
        }
    }

    public boolean finishReservation(Reservation reservation){
        return arrayList.remove(reservation);
    }

    public ArrayList showAllReservation(){
        return arrayList;
    }


}
