package org.sgj.delegatepattern.demo;

public class ConcreteTaskB implements ITask {
    @Override
    public void doSomething() {
        System.out.println(" B 去 冲茶");
    }
}
