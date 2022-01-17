package org.sgj.delegatepattern.demo;

import java.util.HashMap;
import java.util.Map;

public class TaskDelegate{

    public Map<String,ITaskDelegate> taskMap = new HashMap<String,ITaskDelegate>();

    public TaskDelegate() {
        taskMap.put("Coffee",new ConcreteTaskA());
        taskMap.put("Tea",new ConcreteTaskB());
    }

    public void doSomething(String cmd) {
        taskMap.get(cmd).doSomething(cmd);
    }
}
