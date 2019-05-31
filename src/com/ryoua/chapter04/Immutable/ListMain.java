package com.ryoua.chapter04.Immutable;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ryoua Created on 2019/5/30
 */
public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        new WriteThread(list).start();
        new ReadThread(list).start();
    }
}
