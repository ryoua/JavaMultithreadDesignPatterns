package com.ryoua.chapter04.Immutable;

import java.util.List;

/**
 * @Author ryoua Created on 2019/5/30
 */
public class WriteThread extends Thread{
    private final List<Integer> list;

    public WriteThread(List<Integer> list) {
        super("WriteThread");
        this.list = list;
    }

    public void run() {
        for (int i = 0; true; i++) {
            list.add(i);
            list.remove(0);
        }
    }
}
