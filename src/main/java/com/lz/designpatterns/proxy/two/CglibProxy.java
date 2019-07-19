package com.lz.designpatterns.proxy.two;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *  cglib动态代理（支持继承、接口的代理）
 *  需要导入cglib工具包
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;
    public CglibProxy(Object target){
        this.target=target;
    }

    /**
     * 获取代理对象
     * @return
     */
    public Object getProxyInstance(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("大家好");
        Object invoke = method.invoke(target, objects);
        System.out.println("谢谢大家，希望大家喜欢");
        return invoke;
    }
}
