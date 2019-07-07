package com.base.day4;

public class UserTest {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.regist("user1","user1Pwd");
        userController.regist("user2","user2Pwd");
        userController.login("user1","user1Pwd");
        userController.login("user2","user1Pwd");

    }
}
