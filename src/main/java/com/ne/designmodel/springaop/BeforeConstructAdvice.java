package com.ne.designmodel.springaop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description:
 * Time:Create on 2018/12/16 12:48
 */
public class BeforeConstructAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        if ("construct".equals(method.getName())) {
            ((Construction) o).givePermission();
        }
    }
}
