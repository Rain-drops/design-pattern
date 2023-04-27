package org.sgj.templatemethodpattern.demo.one;

public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();
    }
}
