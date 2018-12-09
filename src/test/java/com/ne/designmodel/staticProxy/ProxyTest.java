package com.ne.designmodel.staticProxy;

import org.junit.Test;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 测试静态代理
 * Time:Create on 2018/12/8 11:17
 */
public class ProxyTest {

    @Test
    public void testProxy(){
        //创建代理对象，将目标对象传递给代理对象，建立代理关系
        UserDaoProxy userDaoProxy = new UserDaoProxy(new UserDao());
        //通过代理对象方法
        userDaoProxy.save();
    }
}
