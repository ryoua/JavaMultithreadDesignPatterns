package test;

public class ThreadForIncrease {
    static int cnt = 0;  //共享数据cnt
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int n = 10000;
                while(n>0){
                    cnt++;
                    n--;
                }
            }
        };
        //多线程环境
        Thread t1  = new Thread(r);
        Thread t2  = new Thread(r);
        Thread t3  = new Thread(r);
        Thread t4  = new Thread(r);
        Thread t5  = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(cnt);
    }

}
