package java_dome10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class LiftOffRunner implements Runnable {

	private BlockingQueue<LiftOff> rockets;
	
	public LiftOffRunner(BlockingQueue<LiftOff> rockets) {
		this.rockets = rockets;
	}
	public void add(LiftOff liftOff) {
		try {
			rockets.put(liftOff);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!Thread.interrupted()) {
			LiftOff rocket;
			try {
				rocket = rockets.take();
				rocket.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("waking from take");
		}
		
		System.out.println("EXiting LiftOffRunner");
		
	}
	
}


public class TestBlockingQueues {

	/**
	 * @param args
	 */
	
	static void getkey() {
		try {
			new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void getkey(String message) {
		System.out.println(message);
		getkey();
	}
	
	static void test(String msg , BlockingQueue<LiftOff> queue ) {
		System.out.println(msg);
		LiftOffRunner runner = new LiftOffRunner(queue);
		Thread thread = new Thread(runner);
		thread.start();
		for( int i = 0 ; i < 5 ; i++)
			runner.add(new LiftOff(i));
		getkey("--->>" + msg + "<<---");
		thread.interrupt();
		System.out.println("Finished" + msg + "test");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("LinkedBlockingQueue", new LinkedBlockingQueue<LiftOff>());
		test("ArrayBlockingQueue", new LinkedBlockingQueue<LiftOff>(3));

	}

}
