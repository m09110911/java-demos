package demo.java.pattern.factory.abstractfactory;

public class CarFactory extends AbstractBaseFactory {
    public Engine createEngine() {
        return new CarEngine();
    }

    public Tyre createTyre() {
        return new CarTyre();
    }
}
