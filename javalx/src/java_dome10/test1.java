package java_dome10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		test();
//		test1();
		test2();
		
	}
	
	public synchronized void test() {
		System.out.println("开始执行");
		try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束");
	}
	
	public void test1() {
		System.out.println("开始执行");
		try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束");
	}
	
	public void test2() {
		synchronized (MyThread.class) {
		System.out.println("开始执行");
		try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束");
		}
	}
}

public class test1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		MyThread myThread = new MyThread();
		for(int i = 0 ; i < 3 ; i++ )
//			exec.execute(myThread);
	       	exec.execute(new MyThread());
		TimeUnit.SECONDS.sleep(2);
		exec.shutdown();

	}

}
