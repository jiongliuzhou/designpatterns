package com.lz.designpatterns.proxy.one;

import com.lz.designpatterns.proxy.ISinger;

/**
 * 〈静态代理〉
 * @author DELL
 * @create 2019/6/27
 * @since 1.0.0
 */
public class StaticProxy implements ISinger {
    private ISinger target;
    public StaticProxy(ISinger target){
        this.target=target;
    }

    //对目标类进行扩展
    public void sing() {
        System.out.println("大家好");
        target.sing();
        System.out.println("谢谢大家，希望大家喜欢");
    }
}
