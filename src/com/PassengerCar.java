package com;

/**
 * 客车，可载人
 */
public class PassengerCar extends Car {

    final String useType = "载人";

    public PassengerCar (String name,int rent,float money){
        this.name = name;
        this.rent = rent;
        this.money = money;

    }

    @Override
    public void info() {
        System.out.println(this.name + "   " + this.money + "   " + this.useType + ":" +this.rent+ "人");
    }

    @Override
    public void price(int count, int days) {
        System.out.println("总价格：" + this.money * count * days);
    }
}
