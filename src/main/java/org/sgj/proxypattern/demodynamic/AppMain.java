package org.sgj.proxypattern.demodynamic;

public class AppMain {
    public static void main(String[] args) {
        ITask instance = (ITask)new JDKTaskProxy().getInstance(new ConcreteTaskImpl());
        instance.doSomething();

        ConcreteTaskImpl instanceClazz = (ConcreteTaskImpl)new CGLIBTaskProxy().getInstance(new ConcreteTaskImpl());
        instanceClazz.doSomething();
    }
}
