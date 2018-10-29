package java_dome10;

public class LiftOff implements Runnable {

	/**
	 * @param args
	 */
	protected int conutDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	public LiftOff() {
		super();
	}

	public LiftOff(int conutDown) {
		this.conutDown = conutDown;
	}
	
	public String status() {
		return "½ø³ÌºÅ" + id + "(" + (conutDown > 0 ? conutDown : "LiftOff") +")";
	}
	
	@Override 
	public void run() {
		// TODO Auto-generated method stub
		while(conutDown-- > 0) {
			System.out.println(status());
			Thread.yield();
		}
	}

}
