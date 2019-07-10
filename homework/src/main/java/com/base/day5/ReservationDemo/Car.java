package com.base.day5.ReservationDemo;

import java.util.Date;

public class Car {
    private String carId;
    private Customer customer;
    private Date lastServiceDate;

    public Car(String carId, Customer customer, Date lastServiceDate) {
        this.carId = carId;
        this.customer = customer;
        this.lastServiceDate = lastServiceDate;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setUser(Customer customer) {
        this.customer = customer;
    }

    public Date getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(Date lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
}
