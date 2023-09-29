package com.example.design_pattern.创建者模式.建造者模式.抽象建造者;

import com.example.design_pattern.创建者模式.建造者模式.具体产品.Bike;

// 抽象 builder 类
public abstract class Builder {

    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();

    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}