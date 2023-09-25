package com.example.design_pattern.工厂模式.工厂方法.具体工厂;

import com.example.design_pattern.工厂模式.工厂方法.具体产品.LatteCoffee;
import com.example.design_pattern.工厂模式.工厂方法.抽象工厂.CoffeeFactory;


public class LatteCoffeeFactory implements CoffeeFactory {
    public LatteCoffee createCoffee() {
        return new LatteCoffee();
    }
}