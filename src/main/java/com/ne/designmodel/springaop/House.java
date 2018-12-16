package com.ne.designmodel.springaop;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 房屋
 * Time:Create on 2018/12/16 12:42
 */
public class House implements Construction {

    private boolean permitted = false;

    @Override
    public void construct() {
        System.out.println("house constructing");
    }

    @Override
    public void givePermission() {
        System.out.println("grant constructing house privilege");
        this.permitted = true;
    }

    @Override
    public boolean isPermitted() {
        return this.permitted;
    }
}
