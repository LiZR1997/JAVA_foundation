package java_dome10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class Pair {
	private int x , y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Pair() { this( 0 , 0 );}
	public int getX() { return x; }
	public int getY() { return y; }
	public void incrementX() { x++; }
	public void incrementY() { y++; }
	public String toString() {
		return "x: " + x + "y: " + y;
	}
	public class PairValuesNotEqualException extends RuntimeException
	{
	    public PairValuesNotEqualException() {
			// TODO Auto-generated constructor stub
	    	super("qwe" + Pair.this);
		}
	    
	}
	
	public void checkState() {
		if(x != y){
			throw new PairValuesNotEqualException();
		}
	}
	
}

abstract class PairManager {
	
	AtomicInteger ckeckCounter = new AtomicInteger(0);
	protected Pair pair = new Pair();
	private java.util.List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());
	public synchronized Pair getPair() {
		return new Pair(pair.getX(), pair.getY());
	}
	
	protected void store(Pair p) {
		storage.add(p);
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public abstract void increment();

}

class PairManager1 extends PairManager {
	
	public synchronized void increment() {
		pair.incrementX();
		pair.incrementY();
		store(getPair());
	}

	
}

class PairManager2 extends PairManager {

	@Override
	public void increment() {
		Pair temp;
		synchronized(this) {
			pair.incrementX();
			pair.incrementY();
			temp = getPair();
		}
		store(temp);
		// TODO Auto-generated method stub
		
	}
	
}

class PairManipulator implements Runnable {
	
	private PairManager pairManager;
	

	public PairManipulator(PairManager pairManager) {
		this.pairManager = pairManager;
	}
	public String toString() {
		return "Pair" + pairManager.getPair() + "checkCounter" +
	pairManager.ckeckCounter.get();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			pairManager.increment();	
	}	
}

class PairChecker implements Runnable {

	private PairManager pairManager;
	public PairChecker(PairManager pairManager) {
		this.pairManager = pairManager;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			pairManager.ckeckCounter.incrementAndGet();
			pairManager.getPair().checkState();
		}
	}
	
}

public class CriticalSection {

	/**
	 * @param args
	 */
	
	static void testApproaches(PairManager pairManager1 , PairManager pairManager2) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		PairManipulator pm1 = new PairManipulator(pairManager1); 
		PairManipulator pm2 = new PairManipulator(pairManager2);
		PairChecker pc1 = new PairChecker(pairManager1);
		PairChecker pc2 = new PairChecker(pairManager2);
		executorService.execute(pm1);
		executorService.execute(pm2);
		executorService.execute(pc1);
		executorService.execute(pc2);
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("pm:" + pairManager1 + "\npm2" + pairManager2);
		System.exit(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairManager pairManager1 = new PairManager1();
		PairManager pairManager2 = new PairManager2();
		testApproaches(pairManager1, pairManager2);

	}

}
























