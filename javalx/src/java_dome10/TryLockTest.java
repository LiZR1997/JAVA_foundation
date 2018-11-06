package java_dome10;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockTest implements Runnable {

	public static ReentrantLock lock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			if(lock.tryLock(1, TimeUnit.SECONDS)) {
	        		Thread.sleep(2000);
			} else {
				System.err.println(Thread.currentThread().getName() + "ªÒ»°À¯ ß∞‹");
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		    if(lock.isHeldByCurrentThread()) lock.unlock();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryLockTest test = new TryLockTest();
		Thread t1 = new Thread(test); t1.setName("1");
		Thread t2 = new Thread(test); t2.setName("2");
		t1.start();t2.start();

	}

}
