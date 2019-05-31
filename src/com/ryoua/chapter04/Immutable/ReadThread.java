package com.ryoua.chapter04.Immutable;

import java.util.List;

/**
 * @Author ryoua Created on 2019/5/30
 */
public class ReadThread extends Thread{
    private final List<Integer> list;

    public ReadThread(List<Integer> list) {
        super("ReadThread");
        this.list = list;
    }

    public void run() {
        while (true) {
            for (int n : list) {
                System.out.println(n);
            }
        }
    }
}
