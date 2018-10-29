package java_dome10;

public class MoreBasicThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 5 ; i++ )
		{
			new Thread(new LiftOff()).start();
			System.out.println("×îºó");
		}

	}

}
