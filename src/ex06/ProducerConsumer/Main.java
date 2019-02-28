package ex06.ProducerConsumer;

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
