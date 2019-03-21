package demo.java.pattern.factory.factorymethod;

import demo.java.pattern.factory.Motorcar;

/**
 * 工厂方法模式，
 * 主要是单一职责 原则
 * 解决 产品链 扩展修改时 ，不需要修改原来的调用代码， 遵循开闭原则 ,提高系统的扩展性
 * 将 不同 子对象 的创建 延伸 到子工厂中，
 */
public  interface MotorcarFactory {
    Motorcar create();
}
