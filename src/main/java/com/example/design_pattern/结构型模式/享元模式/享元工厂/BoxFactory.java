package com.example.design_pattern.结构型模式.享元模式.享元工厂;

import com.example.design_pattern.结构型模式.享元模式.具体享元.IBox;
import com.example.design_pattern.结构型模式.享元模式.具体享元.LBox;
import com.example.design_pattern.结构型模式.享元模式.具体享元.OBox;
import com.example.design_pattern.结构型模式.享元模式.抽象享元模式.AbstractBox;

import java.util.HashMap;

public class BoxFactory {

    private static HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new LBox();
        AbstractBox oBox = new OBox();
        map.put("I", iBox);
        map.put("L", lBox);
        map.put("O", oBox);
    }

    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public AbstractBox getBox(String key) {
        return map.get(key);
    }
}