package com.lz.designpatterns.template;

/**
 * 〈模板框架〉
 * @author DELL
 * @create 2019/6/28
 * @since 1.0.0
 */
public abstract class AbstractTemplate {
    /**
     * 定义做菜步骤,具体实现交给具体的实现类
     */
    public void doDish(){
        this.preparation();
        this.doing();
        this.carriedDishes();
    }

    /**
     * 备料
     */
    public abstract void preparation();
    /**
     * 做菜
     */
    public abstract void doing();
    /**
     * 上菜
     */
    public abstract void carriedDishes ();
}
