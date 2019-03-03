package ex03.Immutable;

/**
 * Immutable模式
 * 介绍: 一个类实例创建后, 状态不会改变, 那么该类就算多线程执行也无所谓
 * 角色: Immutable: 类, 字段值不可修改, 创建之后属性值不会变化, 所以是线程安全的
 * 适用范围: 实例创建后, 状态不再发生变化, 实例共享的且频繁访问
 *
 * 延展: final类: 该类无法被扩展, 没有子类, 所以也就没法重写
 *       final方法: 不会被子类重写, 如果是静态方法, 那么表示不会被子类的方法隐藏
 *       final字段: 只能被赋值一次, 1.初始化赋值, 2.构造器赋值, 3.static代码块(静态初始化代码块)中赋值
 */
public class Main {
    public static void main(String[] args) {
        Person alice = new Person("Alice", "Alaska");
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
    }
}
