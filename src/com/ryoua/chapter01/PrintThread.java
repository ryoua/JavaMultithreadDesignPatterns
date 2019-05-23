package com.ryoua.chapter01;

/**
 * @Author ryoua Created on 2019-05-22
 */
public class PrintThread extends Thread {
    private String message;

    public PrintThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(message);
        }
    }
}
