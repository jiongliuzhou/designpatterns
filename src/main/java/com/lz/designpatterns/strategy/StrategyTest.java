package com.lz.designpatterns.strategy;

/**
 * 策略模式
 * 1、抽象策略角色（Strategy）
 * 2、具体策略角色（AddStrategy、SubStrategy）
 * 3、环境角色（StrategyManage）
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public class StrategyTest {
    public static void main(String[] args){
        StrategyManage strategyManage=new StrategyManage(new AddStrategy());
        System.out.println(strategyManage.calulate(1,2));
        strategyManage=new StrategyManage(new SubStrategy());
        System.out.println(strategyManage.calulate(1,2));
    }
}
