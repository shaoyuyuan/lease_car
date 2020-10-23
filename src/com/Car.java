package com;

/**
 * 车辆父类抽象类
 */

public abstract class Car {
    protected String name;
    protected int rent;
    protected float money;

    //装载
    public abstract void info();
    //价格
    public abstract void price(int count, int days);

}
