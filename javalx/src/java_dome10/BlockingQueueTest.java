package java_dome10;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
		Producer producer1 = new Producer(queue); 
		Producer producer2 = new Producer(queue); 
		Producer producer3 = new Producer(queue); 
		Consumer consumer = new Consumer(queue);
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(producer1);
		exec.execute(producer2);
		exec.execute(producer3);
		exec.execute(consumer);
		
		Thread.sleep(10 * 1000);
		producer1.stop();
		producer2.stop();
		producer3.stop();
		Thread.sleep(2000);
		exec.shutdown();
	}

}
