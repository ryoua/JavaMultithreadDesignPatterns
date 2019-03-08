package ex08.ThreadPerMessage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread-Per-Message模式
 * 角色: Client(委托人), Host, Helper(助手)
 * 范围: 提高响应性, 缩短延迟时间, 适用于操作顺序没有要求时, 适用于不需要返回值时, 适用于服务器
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("main BEGIN");
        ExecutorService executorService = Executors.newCachedThreadPool();
        Host host = new Host(
                executorService
        );
        try {
            host.request(10, 'A');
            host.request(20, 'B');
            host.request(30, 'C');
        } finally {
            executorService.shutdown();
            System.out.println("main END");
        }
    }
}
