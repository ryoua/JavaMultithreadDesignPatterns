package SingleThreadedExecution;

import java.util.Random;

class UserThread1 extends Thread {
    private final static Random random = new Random(26535);
    private final BoundedResource resource;

    public UserThread1(BoundedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            while (true) {
                resource.use();
                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
