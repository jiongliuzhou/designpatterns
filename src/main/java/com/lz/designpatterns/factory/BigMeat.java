/**
 * Copyright (C), 2018-2019, 东深电子
 * FileName: BigMeat
 * Author:   DELL
 * Date:     2019/6/27 11:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.lz.designpatterns.factory;

/**
 * 猪肉
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class BigMeat implements Meat {
    /**
     * 买肉
     */
    public void buyMeat() {
        System.out.println("买肉");
    }

    /**
     * 吃肉
     */
    public void eatMeat() {
        System.out.println("吃肉");
    }
}
