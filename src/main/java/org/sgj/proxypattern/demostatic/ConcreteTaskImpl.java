package org.sgj.proxypattern.demostatic;

public class ConcreteTaskImpl implements ITask{

    @Override
    public void doSomething(String cmd) {
        System.out.println("to do something");
    }
}
