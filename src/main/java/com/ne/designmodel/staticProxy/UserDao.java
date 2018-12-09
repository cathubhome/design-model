package com.ne.designmodel.staticProxy;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 目标对象
 * Time:Create on 2018/12/8 11:13
 */
public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("save method execute...");
    }
}
