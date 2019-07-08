package com.base.day4.userDemo;

import java.util.ArrayList;

public class UserController {
    ArrayList userArrayList = new ArrayList();

    public boolean login(String name, String pwd) {
        boolean result = false;
        for (int i = 0; i < userArrayList.size(); i++) {
            User user = (User) userArrayList.get(i);
            if (name.equals(user.getName()) && pwd.equals(user.getPwd())) {
                result = true;
                System.out.println(user.getName()+" Login");
            }
        }
        if(!result){
            System.out.println("Login failed");
        }
        return result;
    }

    public User regist(String name, String pwd) {
        User user = new User(userArrayList.size() + 1,name, pwd);
        userArrayList.add(user);
        return user;
    }
}
