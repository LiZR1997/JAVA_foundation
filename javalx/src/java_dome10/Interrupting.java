package java_dome10;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class SleepBlocked implements Runnable { //可以中断的阻塞

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class IOBlocked implements Runnable { // i/o操作不可中断

	private InputStream in;
	
	public IOBlocked(InputStream in) {
		this.in = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Waiting for read()");
			in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting IOBocked.run()");
	}
	
}

class SynchronizedBlocked implements Runnable { //synchronized不可中断

	public synchronized void f() {
		while(true) {
			Thread.yield();
		}
	}
	
	public SynchronizedBlocked() {//在构造器中创建匿名的Thread实例
		new Thread() {
			public void run() {//实现Thread（）中run方法
				f();
			}
		}.start();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Trying to call f()");
		f();
		System.out.println("Exiting SynchronizedBlocked.run()");
	}
	
}

public class Interrupting {

	/**
	 * @param args
	 */
	private static ExecutorService exec = Executors.newCachedThreadPool();
	
	static void test(Runnable r) throws InterruptedException {
		Future<?> f = exec.submit(r);
		TimeUnit.MILLISECONDS.sleep(100);
		System.out.println("Interrupting" + r.getClass().getName());
		f.cancel(true);
		System.out.println("Interrupting sent to" + r.getClass().getName());
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		test(new SleepBlocked());
		test(new IOBlocked(System.in));
		test(new SynchronizedBlocked());
		TimeUnit.SECONDS.sleep(3);
		System.out.println("exit(0)");
		System.exit(0);

	}

}






















