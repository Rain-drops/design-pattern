package org.sgj.delegatepattern.demo;

public class Client {
    private TaskDelegate delegate;

    public Client(TaskDelegate delegate) {
        this.delegate = delegate;
    }

    public void doTask(){
        delegate.doTask();
    }

    public void doTask(String cmd){
        delegate.doTask(cmd);
    }
}
