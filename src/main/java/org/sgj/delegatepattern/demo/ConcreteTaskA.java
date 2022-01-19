package org.sgj.delegatepattern.demo;

public class ConcreteTaskA implements ITask {
    @Override
    public void doSomething(String cmd) {
        System.out.println(" A 去 倒" + cmd);
    }
}
