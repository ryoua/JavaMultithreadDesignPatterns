package com.ryoua.chapter06.Balking;

import java.io.IOException;
import java.util.Random;

/**
 * @Author ryoua Created on 2019/5/30
 */
public class ChangerThread extends Thread{
    private final Data data;
    private final Random random = new Random();

    public ChangerThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    public void run() {
        try {
            for (int i = 0; true; i++) {
                data.change("No." + i);
                Thread.sleep(random.nextInt(1000));
                data.save();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
