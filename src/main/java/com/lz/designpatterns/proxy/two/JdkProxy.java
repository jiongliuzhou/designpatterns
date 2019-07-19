package com.lz.designpatterns.proxy.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 〈jdk动态代理〉
 * jdk动态代理只能代理接口
 * @author lz
 * @create 2019/6/27
 * @since 1.0.0
 */
public class JdkProxy implements InvocationHandler{
    private Object target;
    public JdkProxy(Object target){
        this.target=target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("大家好");
        Object invoke = method.invoke(target, args);
        System.out.println("谢谢大家，希望大家喜欢");
        return invoke;
    }
}
