package com.lz.designpatterns.strategy;

/**
 * 策略接口(抽象策略角色)
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public interface Strategy {
    /**
     * 定义的算法
     * @param a
     * @param b
     * @return
     */
    int cal(int a, int b);
}
