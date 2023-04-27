package org.sgj.observerpattern.demo.one;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject generator = new ConcreteSubject();
        new ConcreteObserverA(generator);

        generator.setMessureMents(80, 65, 30.4f);
        generator.setMessureMents(70, 45, 80.4f);
        generator.setMessureMents(40, 75, 50.4f);

    }
}
