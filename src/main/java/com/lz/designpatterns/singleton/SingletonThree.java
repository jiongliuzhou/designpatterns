package com.lz.designpatterns.singleton;
/**
 * 延迟加载
 * 通过内部类的机制使得单例对象可以延迟加载，同时内部类相当于是外部类的静态部分，所以可以通过jvm来保证其线程安全。这种形式比较推荐
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class SingletonThree {
    private SingletonThree(){

    }
    private static class SingletonHolder{
        private static SingletonThree instance=new SingletonThree();
    }

    public static SingletonThree getInstance(){
        return SingletonHolder.instance;
    }
}
