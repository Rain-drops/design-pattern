package org.sgj.proxypattern.demostatic;

public class TaskStaticProxy implements ITask{

    private ConcreteTaskImpl taskImpl;
    public TaskStaticProxy(ConcreteTaskImpl taskImpl) {
        this.taskImpl = taskImpl;
    }

    @Override
    public void doSomething(String cmd) {
        before();
        taskImpl.doSomething(cmd);
        after();
    }

    private void before() {
        System.out.println("---------- Proxy before method ----------");
    }
    private void after() {
        System.out.println("---------- Proxy after method ----------");
    }
}
