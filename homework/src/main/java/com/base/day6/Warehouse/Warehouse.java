package com.base.day6.Warehouse;

import java.util.ArrayList;
import java.util.Date;

public class Warehouse {
    private int wId;
    private String wName;
    private Manager manager;
    private int capacity;
    private ArrayList<Product> storage = new ArrayList<>(this.getCapacity()); //模拟库存

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Product> getStorage() {
        return storage;
    }

    public void setStorage(ArrayList<Product> storage) {
        this.storage = storage;
    }

    public Warehouse(int wId, String wName, Manager manager, int capacity) {
        this.wId = wId;
        this.wName = wName;
        this.manager = manager;
        this.capacity = capacity;
    }

    public boolean input(Product p) {
        boolean rs = false;
        if (storage.size() < this.getCapacity()) {
            p.setInDate(new Date());
            p.setStatus("入库");
            storage.add(p);
            rs = true;
        } else {
            System.out.println("仓库已满");
        }
        return rs;
    }

    public boolean output(Product p) {
        boolean rs = false;
        if (storage.contains(p)) {
            p.setOutDate(new Date());
            p.setStatus("出库");
            storage.remove(p);
            rs = true;
        } else {
            System.out.println("无此货物");
        }
        return rs;
    }

    public void show() {
        for (int i = 0; i < storage.size(); i++) {
            Product product = storage.get(i);
            product.show();
            System.out.println();
        }
    }
}
