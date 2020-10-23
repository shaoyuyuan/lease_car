package com;

/**
 * 皮卡，可载货，载人
 */
public class PickCar extends Car {

    final String useType = "载人、货";

    public PickCar (String name,int rent,float money){

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
