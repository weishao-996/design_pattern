package com.example.design_pattern.工厂模式.简单工厂.抽象产品;

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
