/**
 * Copyright (C), 2018-2019, 东深电子
 * FileName: Orange
 * Author:   DELL
 * Date:     2019/6/27 11:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.lz.designpatterns.factory;

/**
 * 橘子
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class Orange implements Fruit {
    /**
     * 种水果
     */
    public void plantFruit() {
        System.out.println("种橘子");
    }

    /**
     * 吃水果
     */
    public void eatFruit() {
        System.out.println("吃橘子");
    }
}
