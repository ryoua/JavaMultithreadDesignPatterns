package com.ryoua.chapter04.Immutable;

/**
 * @Author ryoua Created on 2019/5/30
 */
public class PrintPersonThread extends Thread{
    private Person person;

    public PrintPersonThread(Person person) {
        this.person = person;
    }

    public void run() {
        while (true)
            System.out.println(Thread.currentThread().getName() + " prints " + person);
    }
}
