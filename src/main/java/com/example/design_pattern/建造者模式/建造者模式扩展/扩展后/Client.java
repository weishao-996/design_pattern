package com.example.design_pattern.建造者模式.建造者模式扩展.扩展后;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder()
                .cpu("intel")
                .mainboard("华硕")
                .memory("金士顿")
                .screen("三星")
                .build();
        System.out.println(phone);
    }
}