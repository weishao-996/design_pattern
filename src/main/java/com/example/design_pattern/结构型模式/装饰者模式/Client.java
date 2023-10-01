package com.example.design_pattern.结构型模式.装饰者模式;

import com.example.design_pattern.结构型模式.装饰者模式.具体构件.FriedNoodles;
import com.example.design_pattern.结构型模式.装饰者模式.具体构件.FriedRice;
import com.example.design_pattern.结构型模式.装饰者模式.具体装饰.Bacon;
import com.example.design_pattern.结构型模式.装饰者模式.具体装饰.Egg;
import com.example.design_pattern.结构型模式.装饰者模式.抽象构件.FastFood;

//测试类
public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();
        //花费的价格
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("========");
        //点一份加鸡蛋的炒饭
        FastFood food1 = new FriedRice();

        food1 = new Egg(food1);
        //花费的价格
        System.out.println(food1.getDesc() + " " + food1.cost() + "元");

        System.out.println("========");
        //点一份加培根的炒面
        FastFood food2 = new FriedNoodles();
        food2 = new Bacon(food2);
        //花费的价格
        System.out.println(food2.getDesc() + " " + food2.cost() + "元");
    }
}