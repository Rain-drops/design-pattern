package org.sgj.delegatepattern.demo;

public class ConcreteTaskB implements ITaskDelegate{
    @Override
    public void doSomething(String id) {
        System.out.println(" B 去 冲茶");
    }
}
