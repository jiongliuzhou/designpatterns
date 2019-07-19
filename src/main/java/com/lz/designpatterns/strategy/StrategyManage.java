package com.lz.designpatterns.strategy;

/**
 * 环境角色
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public class StrategyManage {
    private Strategy strategy;
    public StrategyManage(Strategy strategy){
        this.strategy=strategy;
    }

    public int calulate(int a,int b){
        return strategy.cal(a,b);
    }
}
