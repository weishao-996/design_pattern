package com.example.design_pattern.工厂模式.抽象工厂.具体产品;

import com.example.design_pattern.工厂模式.抽象工厂.抽象产品.Hamburger;

public class SpicyChickenThighBurger extends Hamburger {

    @Override
    public void taste() {
        System.out.println("肯德基的香辣鸡腿堡真好吃！！");
    }
}
