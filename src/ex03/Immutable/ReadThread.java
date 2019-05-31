package ex03.Immutable;

import java.util.List;

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
