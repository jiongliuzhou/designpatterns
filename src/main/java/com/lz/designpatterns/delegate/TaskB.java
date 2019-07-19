package com.lz.designpatterns.delegate;

/**
 * 〈具体任务角色〉
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public class TaskB implements AbstractTask{
    public void doTask() {
        System.out.println("TaskB");
    }
}
