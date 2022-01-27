package org.sgj.proxypattern.demodynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKTaskProxy implements InvocationHandler {

    private Object targetObj;

    public Object getInstance(Object obj) {
        this.targetObj = obj;
        Class<?> clazz = this.targetObj.getClass();
            return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(targetObj, args);
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
