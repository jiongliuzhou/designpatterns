package com.lz.designpatterns.proxy;

/**
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class SingerThree extends SingerTwo{
    public void sing() {
        super.sing();
        System.out.println("我给大家唱一首只是知否");
    }
}
