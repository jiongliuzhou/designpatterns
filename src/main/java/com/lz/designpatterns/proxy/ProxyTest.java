package com.lz.designpatterns.proxy;

import com.lz.designpatterns.proxy.one.StaticProxy;
import com.lz.designpatterns.proxy.two.CglibProxy;
import com.lz.designpatterns.proxy.two.JdkProxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式
 * 1、静态代理
 * 2、动态代理
 *      jdk动态代理：支持接口代理
 *      cglib动态代理：支持类、继承、接口代理，需要导入cglib包
 */
public class ProxyTest {
    public static void main(String[] args){
        System.out.println("==========静态代理测试开始==========");
        ISinger singerOne=new SingerOne();
        StaticProxy proxy=new StaticProxy(singerOne);
        proxy.sing();
        System.out.println("==========静态代理测试结束==========");


        System.out.println();
        System.out.println("==========jdk动态代理测试开始==========");
        //代理接口
        JdkProxy handler=new JdkProxy(singerOne);
        ISinger o =(ISinger) Proxy.newProxyInstance(singerOne.getClass().getClassLoader(), new Class[]{ISinger.class}, handler);
        o.sing();
        System.out.println("==========jdk动态代理测试结束==========");


        System.out.println();
        System.out.println("==========cglib动态代理测试开始==========");
        //代理接口
        CglibProxy cglibProxy=new CglibProxy(singerOne);
        ISinger proxyInstance =(ISinger) cglibProxy.getProxyInstance();
        proxyInstance.sing();

        //代理类
        SingerTwo singerTwo=new SingerTwo();
        cglibProxy=new CglibProxy(singerTwo);
        SingerTwo proxyTwo =(SingerTwo) cglibProxy.getProxyInstance();
        proxyTwo.sing();

        //代理子类
        SingerTwo st=new SingerThree();
        cglibProxy=new CglibProxy(st);
        SingerTwo singerThree =(SingerTwo) cglibProxy.getProxyInstance();
        singerThree.sing();
        System.out.println("==========cglib动态代理测试结束==========");
    }
}
