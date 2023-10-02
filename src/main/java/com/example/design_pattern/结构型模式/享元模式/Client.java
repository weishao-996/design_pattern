package com.example.design_pattern.结构型模式.享元模式;

import com.example.design_pattern.结构型模式.享元模式.享元工厂.BoxFactory;

public class Client {

    public static void main(String[] args) {
        BoxFactory.getInstance().getBox("I").display("red");
    }
}
