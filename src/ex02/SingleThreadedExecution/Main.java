package ex02.SingleThreadedExecution;

/**
 * Single Thread Execution 模式
 * 介绍: 设置条件, 同一时间只能让一个线程运行(是很多多线程模式的基础)
 * 角色: SharedResource: 可以被多个线程访问的类, 主要分为safeMethod和unsafeMethod, 可以通过synchronized来保护unsafeMethod方法
 * 适用范围: 多线程时, 多个线程访问时, 状态有可能发生变化时, 需要确保安全性时
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Gate, hit CTRL+C to exit");
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bobby", "Brazil").start();
        new UserThread(gate, "Chris", "Canada").start();
    }
}
