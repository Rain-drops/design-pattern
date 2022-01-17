package org.sgj.delegatepattern.demo;

public class ConcreteTaskA implements ITaskDelegate{
    @Override
    public void doSomething(String id) {
        System.out.println(" A 去 泡咖啡");
    }
}
