package org.sgj.proxypattern.demo;

public class TaskStaticProxy implements ITask{

    private TaskImpl taskImpl;
    public TaskStaticProxy(TaskImpl taskImpl) {
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
