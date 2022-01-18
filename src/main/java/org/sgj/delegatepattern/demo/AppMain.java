package org.sgj.delegatepattern.demo;

public class AppMain {

    public static void main(String[] args) {
        TaskDelegate taskLookup = new TaskDelegate();
        taskLookup.setType("Tea");

        new Client(taskLookup).doTask("Coffee");

        new Client(taskLookup).doTask();
    }

}
