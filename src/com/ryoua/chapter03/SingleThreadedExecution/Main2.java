package com.ryoua.chapter03.SingleThreadedExecution;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * @Author ryoua Created on 2019-05-23
 */

class Log {
    public static void println(String s) {
        System.out.println(Thread.currentThread().getName() + ": " + s);
    }
}

class BoundedReSource {
    private final Semaphore semaphore;
    private final int permits;
    private final static Random random = new Random(314159);

    public BoundedReSource(int permits) {
        this.semaphore = new Semaphore(permits);
        this.permits = permits;
    }

    public void use() throws InterruptedException {
        semaphore.acquire();
        try {
            doUse();
        } finally {
            semaphore.release();
        }
    }

    public void doUse() throws InterruptedException {
        Log.println("begin: used = " + (permits - semaphore.availablePermits()));
        Thread.sleep(random.nextInt(500));
        Log.println("end: used = " + (permits - semaphore.availablePermits()));
    }
}

class UserThread2 extends Thread{
    private final static Random random = new Random(26535);
    private final BoundedReSource reSource;

    public UserThread2(BoundedReSource reSource) {
        this.reSource = reSource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                reSource.use();
                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {}
    }
}

public class Main2 {
    public static void main(String[] args) {
        BoundedReSource reSource = new BoundedReSource(3);
        for (int i = 0; i < 10; i++) {
            new UserThread2(reSource).start();
        }
    }
}
