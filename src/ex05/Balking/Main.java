package ex05.Balking;

/**
 * Balking 模式
 * 角色: GuardedObject(被防护的对象), 若条件成立则执行, 不然直接返回
 * 适用范围: 并不需要执行时, 不需要等待守护条件成立时, 守护条件仅在第一次成立时
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data("data.txt", "(empty)");
        new ChangerThread("ChangerThread", data).start();
        new SaverThread("SaverThread", data).start();
    }
}
