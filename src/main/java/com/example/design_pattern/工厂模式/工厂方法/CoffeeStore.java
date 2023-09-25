package com.example.design_pattern.工厂模式.工厂方法;

import com.example.design_pattern.工厂模式.工厂方法.具体产品.AmericanCoffee;
import com.example.design_pattern.工厂模式.工厂方法.具体工厂.AmericanCoffeeFactory;
import com.example.design_pattern.工厂模式.工厂方法.具体工厂.LatteCoffeeFactory;
import com.example.design_pattern.工厂模式.工厂方法.抽象工厂.CoffeeFactory;
import com.example.design_pattern.工厂模式.简单工厂.具体工厂.SimpleCoffeeFactory;
import com.example.design_pattern.工厂模式.简单工厂.抽象产品.Coffee;

public class CoffeeStore {

    Coffee orderCoffee(CoffeeFactory coffeeFactory){
        return coffeeFactory.createCoffee();
    }

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.orderCoffee(AmericanCoffee::new).test();
        coffeeStore.orderCoffee(new LatteCoffeeFactory()).test();
    }
}
