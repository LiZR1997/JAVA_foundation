package java_dome10;

public class MultiLock {

	/**
	 * @param args
	 */
	public synchronized void f1(int n) {
		if(n-- > 0)
		{
			System.out.println("f1() -> f2() : " + n);
			f2(n);
		}
	}
	
	public synchronized void f2(int n) {
		if(n-- > 0)
		{
			System.out.println("f2() -> f1() : " + n);
			f1(n);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final MultiLock multiLock = new MultiLock();
		new Thread() {
			public void run() {
				multiLock.f1(10);
			}
		}.start();
		new Thread() {
			public void run() {
				multiLock.f1(5);
			}
		}.start();
		

	}

}
