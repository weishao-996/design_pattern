package com.example.design_pattern.工厂模式.简单工厂_配置文件解除耦合.具体工厂;

import com.example.design_pattern.工厂模式.简单工厂.具体产品.AmericanoCoffee;
import com.example.design_pattern.工厂模式.简单工厂.具体产品.LatteCoffee;
import com.example.design_pattern.工厂模式.简单工厂.抽象产品.Coffee;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    private static Map<String,Coffee> map = new HashMap();

    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            //遍历Properties集合对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                //根据键获取值（全类名）
                String className = p.getProperty((String) key);
                //获取字节码对象
                Class clazz = Class.forName(className);
                Coffee obj = (Coffee) clazz.newInstance();
                map.put((String)key,obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}