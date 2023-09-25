package com.example.design_pattern.工厂模式.简单工厂.具体工厂;

import com.example.design_pattern.工厂模式.简单工厂.具体产品.AmericanoCoffee;
import com.example.design_pattern.工厂模式.简单工厂.具体产品.LatteCoffee;
import com.example.design_pattern.工厂模式.简单工厂.抽象产品.Coffee;

public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}