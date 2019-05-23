package com.ryoua.chapter03.SingleThreadedExecution;

/**
 * @Author ryoua Created on 2019-05-23
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Testing the Gate");
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bolb", "Brazil").start();
        new UserThread(gate, "Cris", "Canada").start();
    }
}
