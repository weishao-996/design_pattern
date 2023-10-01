package com.example.design_pattern.结构型模式.桥接模式;

import com.example.design_pattern.结构型模式.桥接模式.具体实现化角色.AVIFile;
import com.example.design_pattern.结构型模式.桥接模式.扩展抽象化角色.Windows;
import com.example.design_pattern.结构型模式.桥接模式.抽象化角色.OperatingSystemVersion;

//测试类
public class Client {
    public static void main(String[] args) {
        OperatingSystemVersion os = new Windows(new AVIFile());
        os.play("战狼3");
    }
}