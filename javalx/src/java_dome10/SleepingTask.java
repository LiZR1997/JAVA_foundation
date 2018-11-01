package java_dome10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LiftOff {

	/**
	 * @param args
	 */
	public void run() {
		while(conutDown-- > 0) {
			System.out.print(status());
			try {
				TimeUnit.MICROSECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0 ; i < 5 ; i++ )
			exec.execute(new SleepingTask());
		exec.shutdown();

	}

}
