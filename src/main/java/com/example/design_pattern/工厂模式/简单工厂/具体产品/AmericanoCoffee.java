package com.example.design_pattern.工厂模式.简单工厂.具体产品;

import com.example.design_pattern.工厂模式.简单工厂.抽象产品.Coffee;

public class AmericanoCoffee extends Coffee {


    @Override
    public void test() {
        System.out.println("尝起来有点美式的味道！！");
    }
}
