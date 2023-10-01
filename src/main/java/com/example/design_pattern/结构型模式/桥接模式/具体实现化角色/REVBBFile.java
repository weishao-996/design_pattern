package com.example.design_pattern.结构型模式.桥接模式.具体实现化角色;

import com.example.design_pattern.结构型模式.桥接模式.实现化角色.VideoFile;

//rmvb文件
public class REVBBFile implements VideoFile {

    public void decode(String fileName) {
        System.out.println("rmvb文件：" + fileName);
    }
}