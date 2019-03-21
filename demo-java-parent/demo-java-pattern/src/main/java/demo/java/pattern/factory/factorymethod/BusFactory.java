package demo.java.pattern.factory.factorymethod;

import demo.java.pattern.factory.Bus;
import demo.java.pattern.factory.Motorcar;

public class BusFactory implements MotorcarFactory {

    public Motorcar create() {
        return new Bus();
    }
}
