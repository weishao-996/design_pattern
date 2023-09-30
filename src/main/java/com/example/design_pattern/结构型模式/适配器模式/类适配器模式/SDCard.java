package com.example.design_pattern.结构型模式.适配器模式.类适配器模式;

//SD卡的接口
public interface SDCard {
    //读取SD卡方法
    String readSD();
    //写入SD卡功能
    void writeSD(String msg);
}