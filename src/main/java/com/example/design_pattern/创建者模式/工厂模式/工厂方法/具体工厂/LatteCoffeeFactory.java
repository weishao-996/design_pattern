package com.example.design_pattern.创建者模式.工厂模式.工厂方法.具体工厂;

import com.example.design_pattern.创建者模式.工厂模式.简单工厂.抽象产品.Coffee;
import com.example.design_pattern.创建者模式.工厂模式.工厂方法.具体产品.LatteCoffee;
import com.example.design_pattern.创建者模式.工厂模式.工厂方法.抽象工厂.CoffeeFactory;


public class LatteCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}