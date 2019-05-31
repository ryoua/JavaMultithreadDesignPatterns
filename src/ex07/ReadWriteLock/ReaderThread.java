package ex07.ReadWriteLock;


public class ReaderThread extends Thread {
    private final Data data;

    public ReaderThread(Data data) {
        this.data = data;
    }

    public void run() {
        try {
            while (true) {
                char[] readBuf = data.read();
                System.out.println(Thread.currentThread().getName() + " reads " + readBuf);
            }
        } catch (InterruptedException e) {}
    }
}
