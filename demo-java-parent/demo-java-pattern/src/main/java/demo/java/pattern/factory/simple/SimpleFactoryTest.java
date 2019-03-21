package demo.java.pattern.factory.simple;

import demo.java.pattern.factory.Motorcar;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        // 这里 只需要 根据不同的 参数 就可以获取不同的 汽车
        Motorcar motorcar = MotorcarFactory.create("car");
        motorcar.run();
        motorcar = MotorcarFactory.create("bus");
        motorcar.run();
    }
}
