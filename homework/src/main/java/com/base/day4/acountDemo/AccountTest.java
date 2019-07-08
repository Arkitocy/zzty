package com.base.day4.acountDemo;

import java.math.BigDecimal;

public class AccountTest {
    public static void main(String[] args) throws Exception{
        AccountController accountController = new AccountController();
        accountController.regist("小明", new BigDecimal(2000));
        accountController.regist("小红", new BigDecimal(0));
        accountController.regist("小李", new BigDecimal(3000));
        Thread.sleep(5000);
        accountController.showSum(accountController.getAccount("小明"));
        accountController.showSum(accountController.getAccount("小红"));
        accountController.showSum(accountController.getAccount("小李"));
        accountController.transfer(accountController.getAccount("小明"),accountController.getAccount("小红"),new BigDecimal(1000));
        accountController.transfer(accountController.getAccount("小李"),accountController.getAccount("小红"),new BigDecimal(1000));
        accountController.showSum(accountController.getAccount("小明"));
        accountController.showSum(accountController.getAccount("小红"));
        accountController.showSum(accountController.getAccount("小李"));

    }
}
