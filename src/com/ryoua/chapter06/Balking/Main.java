package com.ryoua.chapter06.Balking;

/**
 * @Author ryoua Created on 2019/5/30
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data("data.txt", "(empty)");
        new ChangerThread("ChangerThread", data).start();
        new SaverThread("SaverThread", data).start();
    }
}
