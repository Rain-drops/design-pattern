package org.sgj.proxypattern.demodynamic;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class CGLIBTaskProxy implements MethodInterceptor {
    private Object targetObj;

    public Object getInstance(Object obj) {
        this.targetObj = obj;
        Enhancer enhancer = new Enhancer();
        // 设置父类, Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(targetObj.getClass());
        enhancer.setCallback(this);
        Object result = enhancer.create();
        return result;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object invoke = method.invoke(targetObj, objects);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("---------- Proxy before method ----------");
    }
    private void after() {
        System.out.println("---------- Proxy after method ----------");
    }
}
