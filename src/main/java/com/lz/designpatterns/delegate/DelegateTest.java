package com.lz.designpatterns.delegate;

/**
 * 委派模式
 *  1、抽象任务角色（AbstractTask）
 *  2、具体任务角色（TaskA、TaskB）
 *  3、委派角色（DelegateTask）
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public class DelegateTest {
    public static void main(String[] args){
        AbstractTask task=new DelegateTask();
        task.doTask();
    }
}
