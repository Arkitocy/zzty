package com.base.day5.ReservationDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
    private Car car;
    private Date setDate;
    private Date reservationDate;
    private Boolean status;
    SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分");

    public Reservation(Car car, Date reservationDate) {
        this.car = car;
        this.setDate = new Date();
        this.reservationDate = reservationDate;
        this.status = false;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void show() {
        System.out.println("顾客" + this.getCar().getCustomer().getName() + "的车" + this.getCar().getCarId() + "预约在" + sf.format(this.getReservationDate()) + "服务。预约时间：" + sf.format(this.getSetDate()));
    }

}
