package ex09.WorkerThread;

public class WorkerThread extends Thread{
    private Channel channel;

    public WorkerThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }

    public void run() {
        while (true) {
            Request request = channel.takeRequest();
            request.execute();
        }
    }
}
