package demo.java.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazy;

    public LazyDoubleCheckSingleton() {
    }

    /**
     * 解决了 并发问题 和性能问题，
     */
    public static final LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    /*
                        但是这里创建的时候
                        会转换为多个JVM指令 ，还是 有一点并发问题 指令重排序等问题
                        1.分配内存空间 给 lazy 变量
                        2.初始化对象
                        3.将初始化好的对象 和内存地址关联赋值
                        4。用户初次访问
                     */
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
