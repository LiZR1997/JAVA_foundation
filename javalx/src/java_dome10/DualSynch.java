package java_dome10;

public class DualSynch {
	
	private Object syncObject = new Object();
	public synchronized void f() {
		for(int i = 0 ; i < 5 ; i++ )
		{
			System.out.println("f()");
			Thread.yield(); 
			//使当前线程从执行状态（运行状态）变为可执行态（就绪状态）
			//然后cpu从就绪态队列中挑选一个进程执行
		}
	}
	
//	public void g() {
	public synchronized void g() { //进程同步，f()执行完成后，g()再执行
//		synchronized(syncObject) {//进程控制块，同时执行
			for( int i = 0 ; i < 5 ; i++ )
			{
				System.out.println("g()");
				Thread.yield();
			}
//		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final DualSynch dualSynch = new DualSynch();
		new Thread() {
			public void run() {
				dualSynch.f();
			}
			
		}.start();
		dualSynch.g();

	}

}
