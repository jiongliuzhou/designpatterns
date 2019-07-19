package com.lz.designpatterns.singleton;
/**
 * 懒汉式
 * 通过newInstance里面的判断来进行延迟加载单例对象，加synchronized关键字可以避免多线程问题，但会影响程序性能
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class SingletonTwo {
    private static SingletonTwo instance;
    private SingletonTwo(){

    }

    public synchronized static SingletonTwo getInstance(){
        if(instance==null){
            instance=new SingletonTwo();
        }
        return instance;
    }
}
