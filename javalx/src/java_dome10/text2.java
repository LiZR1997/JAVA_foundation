package java_dome10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class t1 implements Runnable {

	public static ReentrantLock lock = new ReentrantLock(true);
	@Override
	public void run() {//使用公平锁 设为turn
		// TODO Auto-generated method stub
		   lock.lock();
			System.out.println("kaishi");
			try {
				TimeUnit.MILLISECONDS.sleep(200);
				System.out.println(this + "     " + Thread.currentThread());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("jieshu");
			lock.unlock();
		}
		
//	public void run() {
//		// TODO Auto-generated method stub
//		synchronized(t1.class) {
//			System.out.println("kaishi");
//			try {
//				TimeUnit.MILLISECONDS.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("jieshu");
//		}
//		
//	}
	
}

public class text2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0 ; i < 3 ; i ++ )
			exec.execute(new t1());
		TimeUnit.SECONDS.sleep(1);
		exec.shutdown();

	}

}
