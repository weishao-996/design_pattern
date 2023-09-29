package com.example.design_pattern.结构型模式.代理模式.静态代理模式;

//测试类
public class Client {
    public static void main(String[] args) {
        ProxyPoint pp = new ProxyPoint();
        pp.sell();
    }
}