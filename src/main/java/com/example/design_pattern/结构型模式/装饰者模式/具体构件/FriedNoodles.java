package com.example.design_pattern.结构型模式.装饰者模式.具体构件;

import com.example.design_pattern.结构型模式.装饰者模式.抽象构件.FastFood;

//炒面
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "炒面");
    }

    public float cost() {
        return getPrice();
    }
}