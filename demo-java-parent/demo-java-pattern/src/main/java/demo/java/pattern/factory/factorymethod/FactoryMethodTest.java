package demo.java.pattern.factory.factorymethod;

import demo.java.pattern.factory.Motorcar;

public class FactoryMethodTest {
    public static void main(String[] args) {
        // 这里 根据不同的 工厂 就可以获取不同的 汽车
        MotorcarFactory factory = new CarFactory();
        Motorcar motorcar = factory.create();
        motorcar.run();
        factory = new BusFactory();
        motorcar = factory.create();
        motorcar.run();
    }
}
