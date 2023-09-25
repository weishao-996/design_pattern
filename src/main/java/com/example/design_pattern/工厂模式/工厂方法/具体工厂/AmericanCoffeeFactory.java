package com.example.design_pattern.工厂模式.工厂方法.具体工厂;

import com.example.design_pattern.工厂模式.工厂方法.具体产品.AmericanCoffee;
import com.example.design_pattern.工厂模式.工厂方法.抽象工厂.CoffeeFactory;

public class AmericanCoffeeFactory implements CoffeeFactory {
    public AmericanCoffee createCoffee() {
        return new AmericanCoffee();
    }

}