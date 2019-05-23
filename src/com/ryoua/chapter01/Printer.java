package com.ryoua.chapter01;

/**
 * @Author ryoua Created on 2019-05-22
 */
public class Printer implements Runnable {
    private String message;

    public Printer(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(message);
        }
    }
}
