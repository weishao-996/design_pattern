package com.example.design_pattern.建造者模式.具体建造者;

import com.example.design_pattern.建造者模式.具体产品.Bike;
import com.example.design_pattern.建造者模式.抽象建造者.Builder;

//ofo单车Builder类
public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}