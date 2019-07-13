import Controller.ParkController;


import java.sql.Timestamp;

import java.util.Date;


public class TestCarPark {
    public static void main(String[] args) throws Exception {
        ParkController pc = new ParkController();
        pc.in("沪A2B137", new Date());
        pc.out("沪A2B137", new Date(2019 - 1900, 6, 13, 20, 8));
    }
}
