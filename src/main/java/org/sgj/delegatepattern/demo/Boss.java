package org.sgj.delegatepattern.demo;

public class Boss {
    private TaskDelegate leader;
    public Boss(){
        leader = new TaskDelegate();
    }
    public  void doingWork(String id)
    {
        leader.doSomething(id);
    }
}
