package java_dome10;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {
	
	private volatile boolean isRunning = true;
	private BlockingQueue queue;
	private static AtomicInteger count = new AtomicInteger();
	private static final int DATA_SLEEP = 1000;

	 public Producer(BlockingQueue queue) {
	        this.queue = queue;
	    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String data = null;
		Random random = new Random();
		System.out.println("Producer Thread starting");
		try {
		while(isRunning) {
			System.out.println("Product date");
				Thread.sleep(random.nextInt(DATA_SLEEP));
				data = "data" + count.incrementAndGet();
				System.out.println("data" + data + "put queue");
				if(!queue.offer(data,2,TimeUnit.SECONDS)) {
					System.out.println("data put error");
				}
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("exit product Thread");
		}

	}
	
	public void stop() {
		isRunning = false;
	}

}
