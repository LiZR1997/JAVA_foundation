package java_dome10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicityTest implements Runnable {

	private volatile int i = 0;
	public synchronized int getValue() { return i ; }
	private synchronized void eveIncrement() {
		i ++ ;
		i ++ ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			eveIncrement();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newCachedThreadPool();
		AtomicityTest atomicityTest = new AtomicityTest();
		executorService.execute(atomicityTest);
		while(true) {
			int val = atomicityTest.getValue();
			if(val % 2 != 0) {
				System.out.println(val);
				System.exit(0);
			}
		}

	}

}
