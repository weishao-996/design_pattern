package com.example.design_pattern.工厂模式.抽象工厂.抽象工厂;

import com.example.design_pattern.工厂模式.抽象工厂.抽象产品.ChickenSteak;
import com.example.design_pattern.工厂模式.抽象工厂.抽象产品.Hamburger;

public interface FastFoodShop {

    ChickenSteak createChickenSteak();

    Hamburger createHamburger();
}
