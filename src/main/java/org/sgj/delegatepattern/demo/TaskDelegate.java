package org.sgj.delegatepattern.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sgj
 *
 * 委派类
 * 任务分发
 */
public class TaskDelegate {

    public Map<String, ITask> lookup = new HashMap<String, ITask>();

    private String type;

    public TaskDelegate() {
        lookup.put("Coffee",new ConcreteTaskA());
        lookup.put("Tea",new ConcreteTaskB());
    }

    public void doSomething(String cmd) {
        // 饭店经理 委派 服务员 去 冲咖啡
        lookup.get(cmd).doSomething();
    }
}
