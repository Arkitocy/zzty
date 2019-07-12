package com.base.day6.Warehouse;

public class Test {
    public static void main(String[] args) {
        WarehouseController wc = new WarehouseController();
        Manager m1 = new Manager(1, "Manager1");
        Manager m2 = new Manager(2, "Manager2");
        Warehouse w1 = new Warehouse(1, "Warehouse1", m1, 20);
        Warehouse w2 = new Warehouse(2, "Warehouse2", m2, 30);
        Product p1 = new Product(1, "Product1");
        Product p2 = new Product(2, "Product2");
        Product p3 = new Product(3, "Product3");
        Product p4 = new Product(4, "Product4");
        Product p5 = new Product(5, "Product5");
        wc.setManager(m1);
        wc.setManager(m2);
        wc.setProduct(p1);
        wc.setProduct(p2);
        wc.setProduct(p3);
        wc.setProduct(p4);
        wc.setProduct(p5);
        wc.setWarehouse(w1);
        wc.setWarehouse(w2);

        wc.inWarehouse(p1, w1);
        wc.inWarehouse(p3, w2);
//        wc.inWarehouse(p4, w1);
//        wc.inWarehouse(p5, w2);
//        wc.inWarehouse(p2, w2);

        wc.show(w1);
        wc.show(w2);

        wc.outWarehouse(p1,w1);
        wc.show(w1);


    }
}
