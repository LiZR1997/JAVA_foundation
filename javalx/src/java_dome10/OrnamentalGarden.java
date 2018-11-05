package java_dome10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Count {//产生是否进入花园的随机
	private int count = 0 ;
	private Random random = new Random(47);
	public synchronized int increment() {
		int temp = count;
		if(random.nextBoolean())
			Thread.yield();
		return (count = ++temp);
	}
	public synchronized int value() {
		return count;
	}
}

class Entrance implements Runnable {
	private static Count count = new Count();
	private static List<Entrance> entrances = new ArrayList<Entrance>();
	private int number = 0;
	private final int id;
	private static volatile boolean canceled = false;
	public static void cancel() {
		canceled = true;
	}
	
	public Entrance(int id) {
		this.id = id;
		entrances.add(this);
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!canceled) {
			synchronized(this) {
				++number;
			}

			System.out.println(this + "Toal:" + count.increment());//this 指当前对象
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Stopping" + this);
	}
	public synchronized int getValue() {
		return number;
	}
	public String toString() {
		return "Entrance" + id + ":" + getValue();
	}
	public static int getToalCount() {
		return count.value();
	}
	public static int sumEntrances() {
		int sum = 0;
		for(Entrance entrance : entrances)
			sum += entrance.getValue();
		return sum;
	}
}

public class OrnamentalGarden {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new Entrance(i));//使用线程池创建5个线程
		}
		TimeUnit.SECONDS.sleep(2);
		Entrance.cancel();
		exec.shutdown();
		if(!exec.awaitTermination(250, TimeUnit.MILLISECONDS))
			System.out.println("chaoshi");
		System.out.println("Total" + Entrance.getToalCount());
		System.out.println("Sum of Entrances" + Entrance.sumEntrances());

	}

}
