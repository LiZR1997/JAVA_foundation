package java_dome10;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest implements Runnable{
    public static ReentrantLock lock = new ReentrantLock();
    public static int i = 0;

    @Override
    public void run() {
        for (int j = 0; j < 10000; j++) {
            lock.lock();  // 看这里就可以
            //lock.lock(); ①
            try {
                i++;
            } finally {
                lock.unlock(); // 看这里就可以
                //lock.unlock();②
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockTest test = new ReentrantLockTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();t2.start();
//        TimeUnit.MILLISECONDS.sleep(300);
        t1.join(); t2.join(); // main线程会等待t1和t2都运行完再执行以后的流程
        /*
         * join()将多个线程按顺序执行
         * 理解如果不使用join方法，得到的i基本上是0或者 很小的数字，因为thread和thread1线程可能还
         * 没开始运行地，主线程程序就把i的值输出了，使用了join方法后，表示这个主线程愿意等待这个新加入的线
         * 程，直到它执行完
         * */
        System.err.println(i);
    }
}
