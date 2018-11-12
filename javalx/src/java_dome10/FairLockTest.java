package java_dome10;

import java.util.concurrent.locks.ReentrantLock;

public class FairLockTest implements Runnable{
    public static ReentrantLock lock = new ReentrantLock(true);
    /*
     * 所谓公平锁，就是按照时间先后顺序，使先等待的线程先得到锁，而且，公平锁不会产生饥饿锁
     * ，也就是只要排队等待，最终能等待到获取锁的机会
     * */
    @Override
    public void run() {
    	while (true) {
    		try {
    			lock.lock();
    			System.err.println(Thread.currentThread().getName() + "获取到了锁！");
    			try {
    				Thread.sleep(1000);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		} finally {
    			lock.unlock();
    		}
    	}
    }

    public static void main(String[] args) throws InterruptedException {
        FairLockTest test = new FairLockTest();
        Thread t1 = new Thread(test, "线程1");
        Thread t2 = new Thread(test, "线程2");
        t1.start();t2.start();
    }
}
