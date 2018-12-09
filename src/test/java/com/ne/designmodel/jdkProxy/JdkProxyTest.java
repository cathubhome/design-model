package com.ne.designmodel.jdkProxy;

import com.ne.designmodel.staticProxy.IUserDao;
import com.ne.designmodel.staticProxy.UserDao;
import org.junit.Test;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: JDK动态代理测试
 * Time:Create on 2018/12/8 13:13
 */
public class JdkProxyTest {

    @Test
    public void testJdkProxy(){
        IUserDao userDao = new UserDao();
        System.out.println(userDao.getClass());
        IUserDao proxy = (IUserDao) new JdkProxyFactory(userDao).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save();
    }
}
