package com.ne.designmodel.abstractfactory.factory;

import com.ne.designmodel.abstractfactory.product.KeyBoard;
import com.ne.designmodel.abstractfactory.product.Mouse;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: pc厂商（超级工厂）
 * Time:Create on 2018/12/12 16:44
 */
public abstract class AbstractPcFactory {

    /**
     * 生产鼠标
     * @return
     */
    public abstract Mouse produceMouse();

    /**
     * 生产键盘
     * @return
     */
    public abstract KeyBoard produceKeyBoard();

}
