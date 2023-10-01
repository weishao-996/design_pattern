package com.example.design_pattern.结构型模式.外观模式;

import com.example.design_pattern.结构型模式.外观模式.外观角色.SmartAppliancesFacade;

//测试类
public class Client {
    public static void main(String[] args) {
        //创建外观对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //客户端直接与外观对象进行交互
        facade.say("打开家电");
        facade.say("关闭家电");
    }
}