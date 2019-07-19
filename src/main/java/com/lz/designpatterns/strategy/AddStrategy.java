package com.lz.designpatterns.strategy;

/**
 * 加法策略(具体策略角色)
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public class AddStrategy implements Strategy {
    /**
     * 定义的算法
     * @param a
     * @param b
     * @return
     */
    public int cal(int a, int b) {
        System.out.print("加法策略："+a+"+"+b+"=");
        return a+b;
    }
}
