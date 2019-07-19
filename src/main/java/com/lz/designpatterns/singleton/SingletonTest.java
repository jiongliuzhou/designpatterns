package com.lz.designpatterns.singleton;

/**
 * 单例模式
 *  1、定义静态成员
 *  2、构造函数私有化
 *  3、提供共有的获取唯一实例方法
 * 饿汉式（SingletonOne）
 * 懒汉式（SingletonTwo）
 * 静态内部类（SingletonThree）
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public class SingletonTest {
    public static void main(String[] args){
        SingletonOne singletonOne=SingletonOne.getInstance();
        System.out.println("=========="+singletonOne+"==========");
        singletonOne=SingletonOne.getInstance();
        System.out.println("=========="+singletonOne+"==========");

        System.out.println();
        SingletonTwo singletonTwo=SingletonTwo.getInstance();
        System.out.println("=========="+singletonTwo+"==========");
        singletonTwo=SingletonTwo.getInstance();
        System.out.println("=========="+singletonTwo+"==========");

        System.out.println();
        SingletonThree singletonThree= SingletonThree.getInstance();
        System.out.println("=========="+singletonThree+"==========");
        singletonThree= SingletonThree.getInstance();
        System.out.println("=========="+singletonThree+"==========");
    }

}
