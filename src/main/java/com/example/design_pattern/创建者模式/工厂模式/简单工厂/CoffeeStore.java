package com.example.design_pattern.创建者模式.工厂模式.简单工厂;

import com.example.design_pattern.创建者模式.工厂模式.简单工厂.具体工厂.SimpleCoffeeFactory;
import com.example.design_pattern.创建者模式.工厂模式.简单工厂.抽象产品.Coffee;

public class CoffeeStore {

    Coffee orderCoffee(String type){
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        return coffee;
    }

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("americano");
        coffee.test();
        Coffee coffee2 = coffeeStore.orderCoffee("latte");
        coffee2.test();

    }
}
