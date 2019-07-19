package com.lz.designpatterns.template;

/**
 * 模板框架
 * 1、定义基本流程模板
 * 2、具体实现交给具体实现类
 * @author lz
 * @create 2019/6/28
 * @since 1.0.0
 */
public class TemplateTest {
    public static void main(String[] args){
        AbstractTemplate abstractTemplate=new EggsWithTomato();
        abstractTemplate.doDish();
        System.out.println("-----------------------------");
        abstractTemplate=new Bouilli();
        abstractTemplate.doDish();
    }
}
