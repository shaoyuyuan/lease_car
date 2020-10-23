package com;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎使用租车系统");
        System.out.println("是否想要租车,1是 0否:");

        Scanner in = new Scanner(System.in);

        int inSys;

        try {
            inSys = in.nextInt();
        } catch (InputMismatchException e) {
            //输入类型错误
            e.printStackTrace();
            System.out.println("需要输入数字");
        }

        if (new Scanner(System.in).nextInt() == 1){
            System.out.println("下面是车辆价格表：");

            System.out.println("序号" + "     " + "品牌" + "   " + "价格（天）" + "   " + "容量");

            Car[] list = {new PassengerCar("红旗",5,300f),
                    new PassengerCar("本田",5,100f),
                    new PassengerCar("本田",5,100f),
                    new TruckCar("大众",10,700f),
                    new TruckCar("丰田",20,1000f),
                    new PickCar("丰田",3,400f),
            };

            //显示价格表
            for (int i = 0; i < list.length; i++){
                System.out.print(i+1 + "、 ");
                //输出车辆信息
                list[i].info();
            }

            System.out.println("请选择要租的汽车编号");

            //车辆编号
            int code = 0;

            try {

                //验证编号是否正确
                code = new Scanner(System.in).nextInt();

            } catch (InputMismatchException e){
                e.printStackTrace();
            }

            try {

                System.out.println("您选择的车辆信息如下：");
                //车辆信息
                list[code].info();

            } catch (ArrayIndexOutOfBoundsException e){
                //数组索引越界
                System.out.println("未找到相关车辆信息！请重新选择");

                //车辆编号
                code = new Scanner(System.in).nextInt();

                if (list.length <= code){

                    System.out.println("未找到相关车辆信息！退出系统！");
                    System.exit(0);

                }
            }

            System.out.println("请输入要租多少辆:");
            int count = new Scanner(System.in).nextInt();

            System.out.println("请输入租赁天数:");
            int days = new Scanner(System.in).nextInt();

            //显示总价格
            list[code - 1].price(count, days);

        } else {

            System.out.println("欢迎下次使用");

        }

    }
}
