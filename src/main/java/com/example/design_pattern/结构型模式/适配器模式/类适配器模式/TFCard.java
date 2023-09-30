package com.example.design_pattern.结构型模式.适配器模式.类适配器模式;

//TF卡接口
public interface TFCard {
    //读取TF卡方法
    String readTF();
    //写入TF卡功能
    void writeTF(String msg);
}