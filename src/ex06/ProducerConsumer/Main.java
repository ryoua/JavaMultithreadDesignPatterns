package ex06.ProducerConsumer;

/**
 * Producer-Consumer模式
 * 简介: 生产者安全地将数据交给消费者
 * 角色: Data, Producer, Consumer, Channel
 */
public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);
        new MakerThread("MakerThread-1", table, 31514).start();
        new MakerThread("MakerThread-2", table, 31515).start();
        new MakerThread("MakerThread-3", table, 31511).start();
        new EaterThread("EaterThread-1", table, 73154).start();
        new EaterThread("EaterThread-2", table, 73153).start();
        new EaterThread("EaterThread-3", table, 73151).start();
    }
}
