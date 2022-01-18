package org.sgj.delegatepattern.demo;

import java.util.HashMap;
import java.util.Map;

public class TaskDelegate {

    public Map<String, ITask> lookup = new HashMap<String, ITask>();

    private String type;

    public TaskDelegate() {
        lookup.put("Coffee",new ConcreteTaskA());
        lookup.put("Tea",new ConcreteTaskB());
    }

    public void setType(String cmd){
        this.type = cmd;
    }

    public void doTask() {
        lookup.get(type).doSomething();
    }

    public void doTask(String cmd) {
        lookup.get(cmd).doSomething();
    }
}
