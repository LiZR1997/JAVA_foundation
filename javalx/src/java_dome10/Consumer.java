package java_dome10;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
	
	private BlockingQueue<String> queue;
	private static final int Data_get_sleep = 1000;

	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Consumer start");
		Random random = new Random();
		boolean isRunning = true;
		try {
		while(isRunning) {
			System.out.println("get Queue data");
				String data = queue.poll(2, TimeUnit.SECONDS);
				if (data != null) {
					System.out.println("get data success" + data);
					System.out.println("geting success" + data);
					Thread.sleep(random.nextInt(Data_get_sleep));
				} else {
					isRunning = false;//若两秒后还未获取数据，不再等待，循环请求数据
				}
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("exit Consumer Thread");
		}

	}

}
