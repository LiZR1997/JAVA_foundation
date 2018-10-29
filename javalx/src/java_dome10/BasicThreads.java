package java_dome10;

public class BasicThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new LiftOff());
		thread.start();
		for(int i = 0 ; i < 1000 ; i++ )
		System.out.print(i);
	}
	

}
