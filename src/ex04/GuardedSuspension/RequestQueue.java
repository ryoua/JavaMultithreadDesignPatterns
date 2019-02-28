package ex04.GuardedSuspension;

import java.net.Authenticator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class RequestQueue {
    private final BlockingQueue<Request> queue = new LinkedBlockingQueue<Request>();

    public synchronized Request getRequest() {
        Request req = null;

        try {
            req = queue.take();
        } catch (InterruptedException e) {
        }
        return req;
    }

    public void putRequest(Request request) {
        try {
           queue.put(request);
        } catch (InterruptedException e) {
        }
    }
}
