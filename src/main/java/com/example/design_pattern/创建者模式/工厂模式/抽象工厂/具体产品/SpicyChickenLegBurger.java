package com.example.design_pattern.创建者模式.工厂模式.抽象工厂.具体产品;

import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象产品.Hamburger;

public class SpicyChickenLegBurger extends Hamburger {

    @Override
    public void taste() {
        System.out.println("麦当劳的麦辣鸡腿堡真好吃！！！");
    }

}
