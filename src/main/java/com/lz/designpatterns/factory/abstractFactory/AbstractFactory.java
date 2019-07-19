package com.lz.designpatterns.factory.abstractFactory;

import com.lz.designpatterns.factory.Fruit;
import com.lz.designpatterns.factory.Meat;

/**
 * 〈一句话功能简述〉<br> 
 * 〈抽象工厂模式〉
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public interface AbstractFactory {
    /**
     * 获取水果
     * @param whichFruit
     * @return
     */
    Fruit fruit(Fruit whichFruit);

    /**
     * 获取肉类
     * @param whichMeat
     * @return
     */
    Meat meat(Meat whichMeat);
}
