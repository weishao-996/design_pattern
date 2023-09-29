package com.example.design_pattern.创建者模式.工厂模式.抽象工厂.具体工厂;

import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.具体产品.CrispyChickenWithWheatWheatSauce;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.具体产品.SpicyChickenLegBurger;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象产品.ChickenSteak;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象产品.Hamburger;
import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象工厂.FastFoodShop;

public class McDonaldS implements FastFoodShop {
    @Override
    public ChickenSteak createChickenSteak() {
        return new CrispyChickenWithWheatWheatSauce();
    }

    @Override
    public Hamburger createHamburger() {
        return new SpicyChickenLegBurger();
    }
}
