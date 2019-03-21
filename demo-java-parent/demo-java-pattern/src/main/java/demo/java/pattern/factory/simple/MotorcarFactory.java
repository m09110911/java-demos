package demo.java.pattern.factory.simple;

import demo.java.pattern.factory.Bus;
import demo.java.pattern.factory.Car;
import demo.java.pattern.factory.Motorcar;

/**
 * 简单工厂模式， 属于创建型设计模式
 * <p>
 * 主要将 一系列 不同子对象 的创建 封装在工厂里，
 * 对 调用客户端来讲， 就不需要关心 对象  的创建过程，
 * 只需要 告诉（通过参数）工厂 需要的对象即可，
 */
public class MotorcarFactory {


    public static Motorcar create(String type) {
        if (type.equals("car")) {
            return new Car();
        } else if (type.equals("bus")) {
            return new Bus();
        } else {
            return null;
        }
    }

}
