package org.sgj.proxypattern.demo;

public class AppMain {

    public static void main(String[] args) {
        new TaskStaticProxy(new TaskImpl()).doSomething("hehe");
    }

}
