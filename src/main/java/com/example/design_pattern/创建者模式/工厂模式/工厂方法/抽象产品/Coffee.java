package com.example.design_pattern.创建者模式.工厂模式.工厂方法.抽象产品;

import lombok.Data;

@Data
public abstract class Coffee {

    String name;

    public void addMike(){
        System.out.println("加点牛奶");
    }

    public void addSugar(){
        System.out.println("加点糖");
    }

    public abstract void test();

}
