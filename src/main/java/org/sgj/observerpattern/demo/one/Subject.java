package org.sgj.observerpattern.demo.one;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Subject {

    private ArrayList observers = new ArrayList();

    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(float temp, float humidity, float pressure) {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(temp, humidity, pressure);
        }
    }

    public abstract void execute();
}
