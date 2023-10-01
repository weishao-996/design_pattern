package com.example.design_pattern.结构型模式.装饰者模式.具体装饰;

import com.example.design_pattern.结构型模式.装饰者模式.抽象构件.FastFood;
import com.example.design_pattern.结构型模式.装饰者模式.抽象装饰.Garnish;

//培根配料
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {

        super(fastFood,2,"培根");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}