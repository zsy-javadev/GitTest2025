package com.kk.domain;

/**
 * @Description:
 * @Author: zsy
 * @CreateTime: 2025/4/20 00:24
 */
public class Person {
    private String id;
    private String name;
    private int age;
    private double score;

    public double getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
