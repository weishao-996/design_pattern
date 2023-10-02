package com.example.design_pattern.结构型模式.享元模式.抽象享元模式;

public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}