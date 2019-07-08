package com.base.day4.acountDemo;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private int id;
    private String name;
    private BigDecimal sum;
    private Date lastupdate;

    public Account(int id, String name, BigDecimal sum, Date lastupdate) {
        this.id = id;
        this.name = name;
        this.sum = sum;
        this.lastupdate = lastupdate;
    }

    public Account() {
    }

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

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public void sumsubstract(BigDecimal trans) {
        this.sum = this.sum.subtract(trans);
    }

    public void sumadd(BigDecimal trans) {
        this.sum = this.sum.add(trans);
    }

    public void updateDate(){
        this.lastupdate=new Date();
    }
}
