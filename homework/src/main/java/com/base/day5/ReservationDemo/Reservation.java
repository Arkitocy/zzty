package com.base.day5.ReservationDemo;

import java.util.Date;

public class Reservation {
    private Car car;
    private Date setDate;
    private Date reservationDate;

    public Reservation(Car car, Date reservationDate) {
        this.car = car;
        this.reservationDate = reservationDate;
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
}
