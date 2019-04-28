package demo.java.pattern.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy;

    private LazySimpleSingleton() {
    }

    //会有并发 问题， 并发 访问时 会初始化 多次，
    // 可以使用 synchronized 修饰 解决并发问题， 但随之而来的 是性能的下降
    public static  final LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
