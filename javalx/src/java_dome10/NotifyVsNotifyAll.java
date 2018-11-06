package java_dome10;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Blocker {
	synchronized void waltingCall() {
		while(!Thread.interrupted()) {
			try {
				wait();
				System.out.println(Thread.currentThread() + " ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	synchronized void prod() {
		notify();
	}
	synchronized void prodAll() {
		notifyAll();
	}
}

class Task implements Runnable {

	static Blocker blocker = new Blocker();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		blocker.waltingCall();
		
	}
	
}

class Task2 implements Runnable {
	
	static Blocker blocker = new Blocker();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		blocker.waltingCall();
		
	}
	
}

public class NotifyVsNotifyAll {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0 ; i < 5 ; i++)
			exec.execute(new Task());
		exec.execute(new Task2());
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			boolean prod = true;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				if(prod) {
					System.out.print("\nnotify()");
					Task.blocker.prod();
				} else {
					System.out.println("\nnotifyAll()");
					Task.blocker.prodAll();
					prod = true;
				}
			}
		}, 400, 400);
		TimeUnit.SECONDS.sleep(5);
		timer.cancel();
		System.out.println("\nTimer canceled");
		TimeUnit.MILLISECONDS.sleep(500);
		Task.blocker.prodAll();
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("shut down");
		exec.shutdown();
		
		

	}

}
