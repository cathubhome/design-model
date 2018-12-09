package com.ne.designmodel.cglibProxy;

import com.ne.designmodel.staticProxy.IUserDao;
import com.ne.designmodel.staticProxy.UserDao;
import org.junit.Test;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: Cglib代理测试
 * Time:Create on 2018/12/9 19:32
 */
public class CglibProxyTest {

    @Test
    public void testCglibProxy(){
        IUserDao proxyInstance = (IUserDao) new CglibProxyFactory(new UserDao()).getProxyInstance();
        proxyInstance.save();
    }
}
