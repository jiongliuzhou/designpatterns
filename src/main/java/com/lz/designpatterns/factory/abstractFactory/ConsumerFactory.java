package com.lz.designpatterns.factory.abstractFactory;

import com.lz.designpatterns.factory.Fruit;
import com.lz.designpatterns.factory.Meat;

/**
 * 〈消费者工厂类〉
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class ConsumerFactory implements AbstractFactory {
    /**
     * 获取水果
     * @param whichFruit
     * @return
     */
    public Fruit fruit(Fruit whichFruit) {
        return whichFruit;
    }

    /**
     * 获取肉类
     * @param whichMeat
     * @return
     */
    public Meat meat(Meat whichMeat) {
        return whichMeat;
    }
}
