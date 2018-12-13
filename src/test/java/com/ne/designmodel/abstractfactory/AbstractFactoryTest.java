package com.ne.designmodel.abstractfactory;

import com.ne.designmodel.abstractfactory.factory.FactoryEnum;
import com.ne.designmodel.abstractfactory.factory.FactoryProducer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 抽象工厂测试
 * Time:Create on 2018/12/12 17:59
 */
public class AbstractFactoryTest {

    @Test
    public void testDell(){
        String productModel = FactoryProducer.getFactory(FactoryEnum.FACTORY_DELL.toString()).produceMouse().productModel();
        Assert.assertEquals("戴尔鼠标",productModel);
    }
    @Test
    public void testLenovo(){
        String productModel = FactoryProducer.getFactory(FactoryEnum.FACTORY_LENOVO.toString()).produceKeyBoard().productModel();
        Assert.assertEquals("联想键盘",productModel);
    }
}
