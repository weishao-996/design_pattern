package com.example.design_pattern.建造者模式;

import com.example.design_pattern.建造者模式.具体产品.Bike;
import com.example.design_pattern.建造者模式.具体建造者.MobikeBuilder;
import com.example.design_pattern.建造者模式.具体建造者.OfoBuilder;
import com.example.design_pattern.建造者模式.抽象建造者.Builder;
import com.example.design_pattern.建造者模式.指挥者.Director;

//测试类
public class Client {
    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    private static void showBike(Builder builder) {
//        Director director = new Director(builder);
//        Bike bike = director.construct();
        Bike bike=builder.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}