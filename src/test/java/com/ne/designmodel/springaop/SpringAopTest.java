package com.ne.designmodel.springaop;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: springAOP测试
 * Time:Create on 2018/12/16 12:50
 */
public class SpringAopTest {

    @Test
    public void testSpringAop() {
        ProxyFactory factory = new ProxyFactory(new House());
        factory.addInterface(Construction.class);
        factory.addAdvice(new BeforeConstructAdvice());
        factory.setExposeProxy(true);

        Construction construction = (Construction) factory.getProxy();
        construction.construct();
        Assert.assertTrue("Construction is illegal. "
                + "Supervisor didn't give a permission to build "
                + "the house", construction.isPermitted());
    }
}
