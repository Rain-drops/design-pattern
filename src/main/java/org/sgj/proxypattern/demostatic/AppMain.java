package org.sgj.proxypattern.demostatic;

public class AppMain {

    public static void main(String[] args) {
        new TaskStaticProxy(new ConcreteTaskImpl()).doSomething("hehe");
    }

}
