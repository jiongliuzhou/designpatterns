package com.lz.designpatterns.singleton;
/**
 * 饿汉式
 * 可以避免多线程问题，但是如果对象初始化比较复杂，会导致程序初始化缓慢
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class SingletonOne {
    private static SingletonOne instance=new SingletonOne();
    private SingletonOne(){

    }

    public static SingletonOne getInstance(){
        return instance;
    }
}
