package java_dome10;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TaskPortion implements Runnable {

	private static int counter = 0 ;
	private final int id = counter++ ;
	private final CountDownLatch latch;
	
	public TaskPortion(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			doWork();
			latch.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}
	
	public void doWork() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(800);
		System.out.println(id + "持有TaskPortion的线程开始执行");
	}
	
	public String toString() {
		return String.format("%1$-3d", id);
	}
	
}

class WaitingTask implements Runnable {
	private static int counter = 0 ;
	private final int id = counter++ ;
	private final CountDownLatch latch;

	public WaitingTask(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			latch.wait();
			System.out.println("WaitingTask " + this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(this + "Interrupted");
		}
		
	}
	public String toString() {
		return String.format("WaitingTask %1$-3d", id); 
	}
	
}

public class CountDownLatchDemo {
	/**
	 * @param args
	 */
	static final int SIZE = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		CountDownLatch latch = new CountDownLatch(SIZE);
		for(int i = 0 ; i < SIZE ; i++ )
			exec.execute(new TaskPortion(latch));
		for(int i = 0 ; i < 10 ; i++ )
			exec.execute(new WaitingTask(latch));
//		for(int i = 0 ; i < SIZE ; i++ )
//			exec.execute(new TaskPortion(latch));
		System.out.println("Launched all tasks");
		exec.shutdown();

	}

}
















