package com.example.design_pattern.工厂模式.简单工厂_配置文件解除耦合;

import com.example.design_pattern.工厂模式.简单工厂.具体工厂.SimpleCoffeeFactory;
import com.example.design_pattern.工厂模式.简单工厂.抽象产品.Coffee;
import com.example.design_pattern.工厂模式.简单工厂_配置文件解除耦合.具体工厂.CoffeeFactory;

public class CoffeeStore {

    Coffee orderCoffee(String type){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(type);
        return coffee;
    }

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        coffee.test();
        Coffee coffee2 = coffeeStore.orderCoffee("latte");
        coffee2.test();

    }
}
