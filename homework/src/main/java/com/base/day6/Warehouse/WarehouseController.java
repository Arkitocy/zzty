package com.base.day6.Warehouse;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class WarehouseController {
    ArrayList<Warehouse> warehouseArrayList = new ArrayList<>();
    ArrayList<Manager> managerArrayList = new ArrayList<>();
    ArrayList<Product> productArrayList = new ArrayList<>();

    public boolean setManager(Manager manager) {
        boolean rs = false;
        if (managerArrayList.size() > 10) {
            System.out.println("管理员数量已满");
        } else {
            managerArrayList.add(manager);
            rs = true;
        }
        return rs;
    }

    public boolean setProduct(Product product) {
        boolean rs = false;
        if (productArrayList.size() > 20) {
            System.out.println("货物数量已满");
        } else {
            productArrayList.add(product);
            rs = true;
        }
        return rs;
    }

    public boolean setWarehouse(Warehouse warehouse) {
        boolean rs = false;
        if (warehouseArrayList.size() > 5) {
            System.out.println("仓库数量已满");
        } else {
            warehouseArrayList.add(warehouse);
            rs = true;
        }
        return rs;
    }

    public Product getProduct(String pName) {
        int n = 0;
        for (int i = 0; i < productArrayList.size(); i++) {
            Product p = productArrayList.get(i);
            if (pName.equals(p.getpName())) {
                n = i;
            }
        }
        return productArrayList.get(n);
    }

    public Warehouse getWarehouse(String wName) {
        int n = 0;
        for (int i = 0; i < warehouseArrayList.size(); i++) {
            Warehouse warehouse = warehouseArrayList.get(i);
            if (wName.equals(warehouse.getwName())) {
                n = i;
            }
        }
        return warehouseArrayList.get(n);
    }

    public void inWarehouse(Product product, Warehouse warehouse) {
        this.getWarehouse(warehouse.getwName()).input(this.getProduct(product.getpName()));
    }


    public void outWarehouse(Product product, Warehouse warehouse) {
        this.getWarehouse(warehouse.getwName()).output(this.getProduct(product.getpName()));
    }

    public void show(Warehouse warehouse) {
        System.out.println("仓库" + warehouse.getwName());
        this.getWarehouse(warehouse.getwName()).show();
        System.out.println("----------");
    }
}

