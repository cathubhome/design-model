package com.ne.designmodel.abstractfactory.factory;

import com.ne.designmodel.abstractfactory.product.DellKeyBoard;
import com.ne.designmodel.abstractfactory.product.DellMouse;
import com.ne.designmodel.abstractfactory.product.KeyBoard;
import com.ne.designmodel.abstractfactory.product.Mouse;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 戴尔工厂（具体工厂）
 * Time:Create on 2018/12/12 17:47
 */
public class DellFactory extends AbstractPcFactory {
    @Override
    public Mouse produceMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard produceKeyBoard() {
        return new DellKeyBoard();
    }
}
