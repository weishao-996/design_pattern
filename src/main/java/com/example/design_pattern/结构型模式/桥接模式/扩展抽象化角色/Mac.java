package com.example.design_pattern.结构型模式.桥接模式.扩展抽象化角色;

import com.example.design_pattern.结构型模式.桥接模式.实现化角色.VideoFile;
import com.example.design_pattern.结构型模式.桥接模式.抽象化角色.OperatingSystemVersion;

//mac版本
public class Mac extends OperatingSystemVersion {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
		videoFile.decode(fileName);
    }
}