package com.ryoua.chapter05.GuardedSuspension;

/**
 * @Author ryoua Created on 2019/5/30
 */
public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 31514897L).start();
        new ServerThread(requestQueue, "Bobby", 51479798L).start();
    }
}
