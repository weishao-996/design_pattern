package com.example.design_pattern.创建者模式.工厂模式.工厂方法.具体产品;

import com.example.design_pattern.创建者模式.工厂模式.简单工厂.抽象产品.Coffee;

public class AmericanCoffee extends Coffee {

    @Override
    public void test() {
        System.out.println("尝起来有点美式的味道！！");
    }
}
