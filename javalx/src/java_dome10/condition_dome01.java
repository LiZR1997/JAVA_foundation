package java_dome10;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class condition_dome01 {

	/**
	 * @param args
	 */
	private static volatile int n = 0 ;
	static ReentrantLock reentrantLock = new ReentrantLock();
	static Condition na = reentrantLock.newCondition();
	static Condition fang = reentrantLock.newCondition();
	static boolean zz = true;
	
//	int add() {
//		return n ++;
//	}
//	
//	int romve() {
//		return n --;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new Runnable() {
//			condition_dome01 c = new condition_dome01();
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(zz) {
				reentrantLock.lock();
				try {
					try {
						while(n <= 0) {
						na.await();
						System.out.println("ֵС��1���޷�ȡֵ");
						}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					TimeUnit.MILLISECONDS.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				n = n - 1;
				System.err.println(Calendar.getInstance().get(Calendar.MILLISECOND) + "�߳�1 -> ��  :  " + n);
				System.out.println();
				fang.signalAll();
				} finally {
				reentrantLock.unlock();
				}
				
			}
			}	});
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(zz) {
					reentrantLock.lock();
					try {
						try {
							while( n >= 10) {
								System.out.println("ֵ���ڣ��������");
								fang.await();
							}
							
							
						}
						catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						n = n + 1;
						System.out.println(Calendar.getInstance().get(Calendar.MILLISECOND) + "�߳�4 -> �ţ� " + n);
						System.out.println();
						na.signalAll();
					} finally {
						reentrantLock.unlock();
					}
				}
			}});
		exec.execute(new Runnable() {
//			condition_dome01 c = new condition_dome01();
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(zz) {
					reentrantLock.lock();
					try {
						try {
							while(n <= 0) {
								na.await();
								System.out.println("ֵС��1���޷�ȡֵ");
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							TimeUnit.MILLISECONDS.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						n = n - 1;
						System.err.println(Calendar.getInstance().get(Calendar.MILLISECOND) + "�߳�5 -> ��  :  " + n);
						System.out.println();
						fang.signalAll();
					} finally {
						reentrantLock.unlock();
					}
					
				}
			}	});
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(zz) {
				reentrantLock.lock();
				try {
				try {
					while( n >= 10) {
						System.out.println("ֵ���ڣ��������");
						fang.await();
					}
					
					
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					TimeUnit.MILLISECONDS.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				n = n + 1;
				System.out.println(Calendar.getInstance().get(Calendar.MILLISECOND) + "�߳�2 -> �ţ� " + n);
				System.out.println();
				na.signalAll();
				} finally {
				reentrantLock.unlock();
				}
			}
		}});
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(zz) {
					reentrantLock.lock();
					try {
						try {
							while( n >= 10) {
								System.out.println("ֵ���ڣ��������");
								fang.await();
							}
							
							
						}
						catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						n = n + 1;
						System.out.println(Calendar.getInstance().get(Calendar.MILLISECOND) + "�߳�3 -> �ţ� " + n);
						System.out.println();
						na.signalAll();
					} finally {
						reentrantLock.unlock();
					}
				}
			}});
		try {
			TimeUnit.MILLISECONDS.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		zz = false;
		exec.shutdown();


	}
	
	
}






























