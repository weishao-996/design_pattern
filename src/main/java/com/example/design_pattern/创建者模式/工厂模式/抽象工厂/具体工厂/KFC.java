package com.example.design_pattern.创建者模式.工厂模式.抽象工厂.具体工厂;

import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.具体产品.FingerSuckingOriginalChicken;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.具体产品.SpicyChickenThighBurger;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象产品.ChickenSteak;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象产品.Hamburger;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象工厂.FastFoodShop;

public class KFC implements FastFoodShop {
    @Override
    public ChickenSteak createChickenSteak() {
        return new FingerSuckingOriginalChicken();
    }

    @Override
    public Hamburger createHamburger() {
        return new SpicyChickenThighBurger();
    }
}
