package com.lz.designpatterns.template;

/**
 * 〈红烧肉〉
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public class Bouilli extends AbstractTemplate{
    /**
     * 备料
     */
    public void preparation() {
        System.out.println("切猪肉和土豆");
    }

    /**
     * 做菜
     */
    public void doing() {
        System.out.println("将切好的猪肉倒入锅中炒一会然后倒入土豆连炒带炖");
    }

    /**
     * 上菜
     */
    public void carriedDishes() {
        System.out.println("将做好的红烧肉盛进碗里端给客人吃");
    }
}
