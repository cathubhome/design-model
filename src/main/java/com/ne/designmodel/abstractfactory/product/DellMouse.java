package com.ne.designmodel.abstractfactory.product;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 戴尔鼠标
 * Time:Create on 2018/12/12 17:43
 */
public class DellMouse implements Mouse{

    @Override
    public String productModel() {
        return "戴尔鼠标";
    }
}
