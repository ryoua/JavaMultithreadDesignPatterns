package com.ryoua.chapter01;

/**
 * @Author ryoua Created on 2019-05-22
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Nice");
        }
    }
}
