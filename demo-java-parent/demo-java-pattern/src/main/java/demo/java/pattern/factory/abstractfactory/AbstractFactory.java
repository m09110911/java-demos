package demo.java.pattern.factory.abstractfactory;

/**
 * 优点 ：将具体产品 在应用层 代码隔离，不需要关心创建细节
 * 将一个系列产品族统一到一起创建
 * <p>
 * 缺点 ：不符合开闭原则 ， 如 再 加 座椅的话， 所有子类都需要添加，
 */
public interface AbstractFactory {

    Engine createEngine();

    Tyre createTyre();
}
