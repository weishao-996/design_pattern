package com.example.design_pattern.创建者模式.工厂模式.抽象工厂;

import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象产品.ChickenSteak;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象产品.Hamburger;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象工厂.FastFoodShop;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.具体工厂.KFC;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.具体工厂.McDonaldS;

public class XIANYU {

    public static Hamburger orderHamburger(FastFoodShop fastFoodShop){
        return fastFoodShop.createHamburger();
    }

    public static ChickenSteak orderChickenSteak(FastFoodShop fastFoodShop){
        return fastFoodShop.createChickenSteak();
    }

    public static void main(String[] args) {
        XIANYU.orderHamburger(new KFC()).taste();
        XIANYU.orderHamburger(new McDonaldS()).taste();
        XIANYU.orderChickenSteak(new McDonaldS()).taste();
        XIANYU.orderChickenSteak(new KFC()).taste();
    }
}
