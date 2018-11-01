package java_dome10;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		while (true) {
				TimeUnit.MILLISECONDS.sleep(200);
			System.out.println(Thread.currentThread() + " " + this);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10 ; i++) {
			Thread damon = new Thread(new SimpleDaemons());
			damon.setDaemon(true);
			damon.start();
		}
		TimeUnit.MILLISECONDS.sleep(275);
	}

}
