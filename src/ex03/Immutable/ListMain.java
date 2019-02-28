package ex03.Immutable;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        new WriteThread(list).start();
        new ReadThread(list).start();
    }
}
