package com.base.day4.acountDemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class AccountController {
    ArrayList accountArrayList = new ArrayList();

    public Account getAccount(String name) {
        Account acc = new Account();
        for (int i = 0; i < this.accountArrayList.size(); i++) {
            Account account = (Account) accountArrayList.get(i);
            if (name.equals(account.getName())) {
                acc = account;
            }
        }
        return acc;
    }

    public void transfer(Account account1, Account account2, BigDecimal trans) {
        if (trans.compareTo(account1.getSum()) > -1) {
            System.out.println(account1.getName() + "账号的余额不足。");
        } else {
            account1.sumsubstract(trans);
            account1.updateDate();
            account2.sumadd(trans);
            account2.updateDate();
            System.out.println("转账成功。");
        }
    }

    public void regist(String name, BigDecimal sum) {
        Account account = new Account(accountArrayList.size() + 1, name, sum, new Date());
        accountArrayList.add(account);
    }

    public void showSum(Account account) {
        System.out.println("用户：" + account.getName() + " 余额:" + account.getSum()+"最后修改时间："+account.getLastupdate());
    }
}
