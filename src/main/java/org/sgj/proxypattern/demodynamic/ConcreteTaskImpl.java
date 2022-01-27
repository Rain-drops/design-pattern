package org.sgj.proxypattern.demodynamic;

public class ConcreteTaskImpl implements ITask {

    @Override
    public void doSomething() {
        System.out.println("to do something");
    }
}
