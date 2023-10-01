package com.example.design_pattern.结构型模式.装饰者模式.具体构件;

import com.example.design_pattern.结构型模式.装饰者模式.抽象构件.FastFood;

//炒饭
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    public float cost() {
        return getPrice();
    }
}