package com.example.design_pattern.结构型模式.桥接模式.具体实现化角色;

import com.example.design_pattern.结构型模式.桥接模式.实现化角色.VideoFile;

//avi文件
public class AVIFile implements VideoFile {
    public void decode(String fileName) {
        System.out.println("avi视频文件："+ fileName);
    }
}