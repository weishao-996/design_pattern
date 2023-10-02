package com.example.design_pattern.结构型模式.享元模式.具体享元;

import com.example.design_pattern.结构型模式.享元模式.抽象享元模式.AbstractBox;

public class LBox extends AbstractBox {

    @Override
    public String getShape() {
        return "L";
    }
}