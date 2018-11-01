package java_dome10;

public class SimpleThread extends Thread {

	/**
	 * @param args
	 */
	private int countDown = 5;
	private static int threadCount = 0;
	
	public SimpleThread() {
		super(Integer.toString(++threadCount));
		start();
	}
	
	public String toString() {
		return "#" + getName() + "(" + countDown + ")";
	}
	
	public void run() {
		while(true) {
			System.out.print(this);
			if(--countDown == 0)
				return;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 5 ; i ++)
			new SimpleThread();
	}

}
