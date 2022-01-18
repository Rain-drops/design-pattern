package org.sgj.delegatepattern.demo;

public class ConcreteTaskA implements ITask {
    @Override
    public void doSomething() {
        System.out.println(" A 去 泡咖啡");
    }
}
