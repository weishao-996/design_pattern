package com.example.design_pattern.结构型模式.装饰者模式.抽象装饰;

import com.example.design_pattern.结构型模式.装饰者模式.抽象构件.FastFood;

//配料类
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price,desc);
        this.fastFood = fastFood;
    }
}