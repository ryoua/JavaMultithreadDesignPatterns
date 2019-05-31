package ex11.TwoPhaseTermination;

/**
 * TwoPhaseTermination 模式
 * 简介: 将结束分为两部分, 分两阶段终止
 * 特点: 安全终止线程(安全性), 必定会进行终止处理(生产性), 发出终止请求后尽快进行终止处理(响应性)
 * 角色: TerminationRequester(终止请求发出者), Terminator(终止者)
 * @Author ryoua Created on 2019/3/8
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("main: Begin");
        try {
            CountupThread t = new CountupThread();
            t.start();
            Thread.sleep(10000);
            System.out.println("main: shutdownRequest");
            t.shutdownRequest();
            t.join();
            System.out.println("main: join");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main: End");
    }
}
