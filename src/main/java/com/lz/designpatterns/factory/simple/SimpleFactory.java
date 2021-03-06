/**
 * Copyright (C), 2018-2019, 东深电子
 * FileName: SimpleFactory
 * Author:   DELL
 * Date:     2019/6/27 11:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.lz.designpatterns.factory.simple;

import com.lz.designpatterns.factory.Apple;
import com.lz.designpatterns.factory.Fruit;
import com.lz.designpatterns.factory.Orange;

/**
 * 简单工厂模式
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class SimpleFactory {
    public static Fruit getFruitFactory(String fruitName){
        if("苹果".equals(fruitName)){
            return new Apple();
        }else if("橘子".equals(fruitName)){
            return new Orange();
        }
        return null;
    }
}
