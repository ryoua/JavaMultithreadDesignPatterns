package ex11.TwoPhaseTermination;

/**
 * @Author ryoua Created on 2019/3/8
 */
public class CountupThread extends Thread{
    private long counter = 0;

    private volatile boolean shutdownRequested = false;

    public void shutdownRequest() {
        shutdownRequested = true;
        interrupt();
    }

    public boolean isShutdownRequested() {
        return shutdownRequested;
    }

    public final void run() {
        try {
            while (!isShutdownRequested())
                doWork();
        } catch (InterruptedException e) {
        } finally {
            doShutDown();
        }
    }



    private void doWork() throws InterruptedException{
        counter++;
        System.out.println("doWork: counter - " + counter);
        Thread.sleep(500);
    }

    private void doShutDown() {
        System.out.println("shutDown: counter - " + counter);
    }
}
