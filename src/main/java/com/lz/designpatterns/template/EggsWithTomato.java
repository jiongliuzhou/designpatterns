package com.lz.designpatterns.template;

/**
 * 番茄炒蛋
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public class EggsWithTomato extends AbstractTemplate{
    /**
     * 备料
     */
    @Override
    public void preparation() {
        System.out.println("洗并切西红柿，打鸡蛋");
    }

    /**
     * 做菜
     */
    @Override
    public void doing() {
        System.out.println("鸡蛋倒入锅里，然后倒入西红柿一起炒");
    }

    /**
     * 上菜
     */
    @Override
    public void carriedDishes() {
        System.out.println("将炒好的西红寺鸡蛋装入碟子里，端给客人吃");
    }
}
