package com.lz.designpatterns.factory;

import com.lz.designpatterns.factory.abstractFactory.AbstractFactory;
import com.lz.designpatterns.factory.abstractFactory.ConsumerFactory;
import com.lz.designpatterns.factory.method.AppleFactory;
import com.lz.designpatterns.factory.method.OrangeFactory;
import com.lz.designpatterns.factory.simple.SimpleFactory;

/**
 * 工厂模式
 *      1、简单工厂
 *      2、工厂方法
 *      3、抽象工厂
 */
public class FactoryTest {
    public static void main(String[] args){
        System.out.println("==========简单工厂模式开始==========");
        Fruit apple = SimpleFactory.getFruitFactory("苹果");
        apple.plantFruit();
        apple.eatFruit();
        Fruit orange = SimpleFactory.getFruitFactory("橘子");
        orange.plantFruit();
        orange.eatFruit();
        System.out.println("==========简单工厂模式结束==========");

        System.out.println();
        System.out.println("==========工厂方法模式开始==========");
        AppleFactory appleFactory=new AppleFactory();
        Fruit fruit = appleFactory.fruit();
        fruit.plantFruit();
        fruit.eatFruit();
        OrangeFactory orangeFactory=new OrangeFactory();
        fruit = orangeFactory.fruit();
        fruit.plantFruit();
        fruit.eatFruit();
        System.out.println("==========工厂方法模式结束==========");

        System.out.println();
        System.out.println("==========抽象工厂模式开始==========");
        Fruit a=new Apple();
        Meat m=new BigMeat();
        AbstractFactory abstractFactory=new ConsumerFactory();
        fruit=abstractFactory.fruit(a);
        fruit.plantFruit();
        fruit.eatFruit();
        Meat meat=abstractFactory.meat(m);
        meat.buyMeat();
        meat.eatMeat();
        System.out.println("==========抽象工厂模式结束==========");

    }
}
