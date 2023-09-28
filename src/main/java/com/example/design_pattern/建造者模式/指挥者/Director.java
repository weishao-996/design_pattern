package com.example.design_pattern.建造者模式.指挥者;

import com.example.design_pattern.建造者模式.具体产品.Bike;
import com.example.design_pattern.建造者模式.抽象建造者.Builder;

//指挥者类
public class Director {
    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}