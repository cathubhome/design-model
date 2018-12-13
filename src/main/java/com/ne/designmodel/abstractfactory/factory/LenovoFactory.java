package com.ne.designmodel.abstractfactory.factory;

import com.ne.designmodel.abstractfactory.product.*;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 联想工厂（具体工厂）
 * Time:Create on 2018/12/12 17:47
 */
public class LenovoFactory extends AbstractPcFactory {
    @Override
    public Mouse produceMouse() {
        return new LenovoMouse();
    }

    @Override
    public KeyBoard produceKeyBoard() {
        return new LenovoKeyBoard();
    }
}
