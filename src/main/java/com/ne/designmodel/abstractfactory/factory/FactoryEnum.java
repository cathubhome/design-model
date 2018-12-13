package com.ne.designmodel.abstractfactory.factory;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description:
 * Time:Create on 2018/12/12 17:55
 */
public enum FactoryEnum {

    FACTORY_DELL("DELL"),
    FACTORY_LENOVO("LENOVO");

    private String factoryName;

    FactoryEnum(String factoryName) {
        this.factoryName=factoryName;
    }

    @Override
    public String toString() {
        return this.factoryName;
    }
}
