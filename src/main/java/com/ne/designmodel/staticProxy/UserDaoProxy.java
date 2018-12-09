package com.ne.designmodel.staticProxy;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 代理对象（静态代理）
 * Time:Create on 2018/12/8 11:14
 */
public class UserDaoProxy implements IUserDao{

    /**
     * 持有的目标对象
     */
    private UserDao target;

    public UserDaoProxy(UserDao userDao) {
        this.target = userDao;
    }

    @Override
    public void save() {
        System.out.println("start transaction");
        //执行目标对象的方法
        target.save();
        System.out.println("transaction commit");
    }
}
