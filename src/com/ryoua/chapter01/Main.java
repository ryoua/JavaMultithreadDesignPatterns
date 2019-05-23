package com.ryoua.chapter01;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @Author ryoua Created on 2019-05-22
 */
public class Main {
    public static void main(String[] args) {
//        new Thread(new Printer("1")).start();
//        new Thread(new Printer("2")).start();
//        ThreadFactory factory = Executors.defaultThreadFactory();
//        factory.newThread(new Printer("3")).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Good");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
