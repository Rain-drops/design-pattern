package org.sgj.observerpattern.demo.one;

public class ConcreteSubject extends Subject{

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void execute() {
        notifyObservers(temperature, humidity, pressure);
    }

    public void setMessureMents(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        execute();
    }
}
