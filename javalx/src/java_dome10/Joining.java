package java_dome10;

class Sleeper extends Thread {
	private int duration;

	public Sleeper(String name , int duration) {
		super(name);
		this.duration = duration;
		start();
	}
	
	public void run() {
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName() + "has awakend" );
	}
}

class Joiner extends Thread {
	private Sleeper sleeper;

	public Joiner(String name , Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}
	
	public void run() {
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(getName() + "has awakend");
	}
	
	
}

public class Joining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleeper sleeper1 = new Sleeper("s1", 1500);
		Sleeper sleeper2 = new Sleeper("s2", 1500);
		Joiner joiner1 = new Joiner("j1", sleeper1);
		Joiner joiner2 = new Joiner("j2", sleeper2);
		sleeper2.interrupt();

	}

}
