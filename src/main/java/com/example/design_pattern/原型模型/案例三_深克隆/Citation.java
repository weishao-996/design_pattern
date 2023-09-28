package com.example.design_pattern.原型模型.案例三_深克隆;

import com.example.design_pattern.原型模型.案例三_深克隆.Student;

import java.io.Serializable;

//奖状类
public class Citation implements Cloneable , Serializable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}