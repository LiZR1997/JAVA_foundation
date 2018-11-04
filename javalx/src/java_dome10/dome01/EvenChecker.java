package java_dome10.dome01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EvenChecker implements Runnable {

	private IntGenerator generator;
	private final int id;
	
	public EvenChecker(IntGenerator generator, int id) {
		this.generator = generator;
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			TimeUnit.MICROSECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(!generator.isCanceled()) {
			generator.cancel();
			int val = generator.next();
			System.out.println(val);
			if(val % 2 != 0) {
				System.out.println(val + "not even");
				generator.cancel1();
			}else {
				System.out.println(Thread.currentThread());
			}
			
		}

	}
	
	public static void test(IntGenerator gp, int count) {
		System.out.println("qi dong xian cheng");
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0 ; i < count ; i ++)
			exec.execute(new EvenChecker(gp, i));
		exec.shutdown();
	}
	
	public static void test(IntGenerator gp) {
		test(gp, 5);
	}

}
