package com.ne.designmodel.abstractfactory.factory;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 工厂生成器，通过不同的厂家获取相应的生产工厂
 * Time:Create on 2018/12/12 17:50
 */
public class FactoryProducer {

    public static AbstractPcFactory getFactory(String factory) {
        switch (factory) {
            case "DELL":
                return new DellFactory();
            case "LENOVO":
                return new LenovoFactory();
            default:
                return null;
        }
    }
}
