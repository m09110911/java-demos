package demo.java.pattern.factory.factorymethod;

import demo.java.pattern.factory.Car;
import demo.java.pattern.factory.Motorcar;

public class CarFactory implements MotorcarFactory {

    public Motorcar create() {
        return new Car();
    }
}
