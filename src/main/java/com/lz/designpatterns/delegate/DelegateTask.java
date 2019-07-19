package com.lz.designpatterns.delegate;

import java.util.Random;

/**
 * 委派角色(和具体任务角色有相同的功能)
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public class DelegateTask implements AbstractTask {
    public void doTask() {
        AbstractTask task=null;
        boolean b = new Random().nextBoolean();
        if(b){
            task=new TaskA();
            task.doTask();
        }else{
            task=new TaskB();
            task.doTask();
        }
    }
}
