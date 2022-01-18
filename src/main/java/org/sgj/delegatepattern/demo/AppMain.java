package org.sgj.delegatepattern.demo;

public class AppMain {

    public static void main(String[] args) {
        TaskDelegate taskLookup = new TaskDelegate();

        // 我跟饭店经理说我要咖啡
        new Client().doSomething("Coffee", taskLookup);

        new Client().doSomething("Tea", taskLookup);
    }

}
