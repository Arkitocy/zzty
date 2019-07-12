package com.base.day6.Warehouse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private int pId;
    private String pName;
    private Date inDate;
    private Date outDate;
    private String status = null;
    SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分");


    public Product(int pId, String pName) {
        this.pId = pId;
        this.pName = pName;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void show() {
        System.out.println("商品id:" + this.getpId());
        System.out.println("商品名称:" + this.getpName());
        System.out.println("商品入库时间:" + sf.format(this.getInDate()));
        System.out.println("商品状态:" + this.getStatus());
    }
}
