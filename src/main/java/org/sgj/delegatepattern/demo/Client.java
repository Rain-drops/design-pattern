package org.sgj.delegatepattern.demo;

public class Client {

    public void doSomething(String cmd, TaskDelegate delegate){
        // 饭店经理去准备咖啡
        delegate.doSomething(cmd);
    }
}
