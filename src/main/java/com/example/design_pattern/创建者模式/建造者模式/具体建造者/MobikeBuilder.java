package com.example.design_pattern.创建者模式.建造者模式.具体建造者;

import com.example.design_pattern.创建者模式.建造者模式.具体产品.Bike;
import com.example.design_pattern.创建者模式.建造者模式.抽象建造者.Builder;

//摩拜单车Builder类
public class MobikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}