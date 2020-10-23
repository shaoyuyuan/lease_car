package com;

/**
 * 货车，可载货
 */
public class TruckCar extends Car {

    final String useType = "载货";

    public TruckCar (String name,int rent,float money){

        this.name = name;
        this.rent = rent;
        this.money = money;

    }


    @Override
    public void info() {
        System.out.println(this.name + "   " + this.money + "   " + this.useType + ":" +this.rent+ "吨");
    }

    @Override
    public void price(int count, int days) {
        System.out.println("总价格：" + this.money * count * days);
    }
}
