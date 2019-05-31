package com.ryoua.chapter05.GuardedSuspension;

import java.util.Random;

/**
 * @Author ryoua Created on 2019/5/30
 */
public class ClientThread extends Thread {
    private final Random random;
    private final RequestQueue requestQueue;

    public ClientThread(RequestQueue requestQueue, String name, long seed) {
        super(name);
        this.random = new Random(seed);
        this.requestQueue = requestQueue;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            Request request = new Request("No: " + i);
            System.out.println(Thread.currentThread().getName() + " request " + request);
            requestQueue.putRequest(request);

            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
            }
        }
    }
}
