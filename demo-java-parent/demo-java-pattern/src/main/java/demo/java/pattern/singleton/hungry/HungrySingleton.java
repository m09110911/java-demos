package demo.java.pattern.singleton.hungry;

// 缺点 浪费资源空间， 因为不管是否使用 都会初始化
public class HungrySingleton {

    private final static HungrySingleton hungry = new HungrySingleton();

    // 构造 私有化
    private HungrySingleton() {
    }

    public static final HungrySingleton getInstance() {
        return hungry;
    }
}
