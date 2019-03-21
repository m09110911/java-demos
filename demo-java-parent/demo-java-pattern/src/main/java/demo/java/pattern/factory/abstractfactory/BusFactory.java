package demo.java.pattern.factory.abstractfactory;

public class BusFactory extends AbstractBaseFactory {
    public Engine createEngine() {
        return new BusEngine();
    }

    public Tyre createTyre() {
        return new BusTyre();
    }
}
