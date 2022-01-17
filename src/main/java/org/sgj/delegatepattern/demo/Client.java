package org.sgj.delegatepattern.demo;

public class Client {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.doingWork("Coffee");
        boss.doingWork("Tea");
    }
}
