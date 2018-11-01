package java_dome10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemoFromFactory implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread() + " " +this);
		}

	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool(
				new DaemonThreadFactory());
		for(int i = 0 ; i < 10 ; i++)
			exec.execute(new DaemoFromFactory());
		System.out.println("Ö´ÐÐ");
		TimeUnit.MILLISECONDS.sleep(500);
	}

}
