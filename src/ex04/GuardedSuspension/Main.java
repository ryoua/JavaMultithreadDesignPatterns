package ex04.GuardedSuspension;

public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();

        new ClientThread(requestQueue, "Alice", 31514897L).start();
        new ServerThread(requestQueue, "Bobby", 51479798L).start();
    }
}
