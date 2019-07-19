package com.lz.designpatterns.factory.method;

import com.lz.designpatterns.factory.Apple;
import com.lz.designpatterns.factory.Fruit;

/**
 * 〈苹果工厂〉
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class AppleFactory implements FactoryMethod{
    public Fruit fruit() {
        return new Apple();
    }
}
