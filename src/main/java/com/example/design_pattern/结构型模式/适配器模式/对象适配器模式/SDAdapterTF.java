package com.example.design_pattern.结构型模式.适配器模式.对象适配器模式;

import com.example.design_pattern.结构型模式.适配器模式.类适配器模式.SDCard;
import com.example.design_pattern.结构型模式.适配器模式.类适配器模式.TFCard;

//创建适配器对象（SD兼容TF）
public class SDAdapterTF  implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}