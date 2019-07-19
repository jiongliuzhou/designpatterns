package com.lz.designpatterns.factory;

/**
 * 苹果
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class Apple implements Fruit {
    public void plantFruit() {
        System.out.println("种苹果");
    }

    public void eatFruit() {
        System.out.println("吃苹果");
    }
}
