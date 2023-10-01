package com.example.design_pattern.结构型模式.桥接模式.抽象化角色;

import com.example.design_pattern.结构型模式.桥接模式.实现化角色.VideoFile;

//操作系统版本
public abstract class OperatingSystemVersion {

    protected VideoFile videoFile;

    public OperatingSystemVersion(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}