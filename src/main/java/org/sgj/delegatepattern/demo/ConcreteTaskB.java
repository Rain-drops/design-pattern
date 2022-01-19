package org.sgj.delegatepattern.demo;

public class ConcreteTaskB implements ITask {
    @Override
    public void doSomething(String cmd) {
        System.out.println(" B 去 倒" + cmd);
    }
}
