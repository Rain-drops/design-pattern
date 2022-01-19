package org.sgj.proxypattern.demo;

public class TaskImpl implements ITask{

    @Override
    public void doSomething(String cmd) {
        System.out.println("to do something");
    }
}
