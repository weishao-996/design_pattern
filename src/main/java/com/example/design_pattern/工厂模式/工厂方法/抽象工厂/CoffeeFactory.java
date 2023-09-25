package com.example.design_pattern.工厂模式.工厂方法.抽象工厂;

import com.example.design_pattern.工厂模式.工厂方法.具体产品.LatteCoffee;
import com.example.design_pattern.工厂模式.简单工厂.抽象产品.Coffee;

public interface CoffeeFactory {
    Coffee createCoffee();
}