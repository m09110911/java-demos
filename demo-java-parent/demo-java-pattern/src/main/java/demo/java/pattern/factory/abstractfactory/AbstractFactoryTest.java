package demo.java.pattern.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new CarFactory();
        factory.createEngine().start();
        factory.createTyre().turn();

        factory = new BusFactory();
        factory.createEngine().start();
        factory.createTyre().turn();
    }
}
