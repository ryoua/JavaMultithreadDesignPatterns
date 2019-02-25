package ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] args) {
//        Thread thread = new MyThread();
//        thread.start();
//
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("Good");
//        }

//        new PrintThread("Nice").start();
//        new PrintThread("Good").start();

//        new Thread(new Printer("Nice")).start();
//        new Thread(new Printer("Good")).start();
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(new Printer("Nice!")).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Goods");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
