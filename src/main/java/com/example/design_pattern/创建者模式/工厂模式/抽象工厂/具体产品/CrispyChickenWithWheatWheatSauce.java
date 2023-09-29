package com.example.design_pattern.创建者模式.工厂模式.抽象工厂.具体产品;

import com.example.design_pattern.创建者模式.工厂模式.抽象工厂.抽象产品.ChickenSteak;

public class CrispyChickenWithWheatWheatSauce extends ChickenSteak {
    @Override
    public void taste() {
        System.out.println("麦当劳的麦麦脆汁鸡真无敌呀！！");
    }
}
