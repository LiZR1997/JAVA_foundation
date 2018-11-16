package java_dome10;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final CountDownLatch latch = new CountDownLatch(3);
		//任何对象调用CountDownLatch的await()均会被阻塞 ，该线程被挂起
		//CountDownLatch内部含有一个初始值，线程执行时调用countDown()可以使该值-1，线程一次调用只能减一次
		//带调用含有countDown()线程数等于CountDownLatch内部含有一个初始值时，主线程开始执行
		// 注意！！ ： 不是含有 countDown()的所有线程执行完成以后 开始执行被await()挂起的线程，而是执行完countDown()方法后
		//被await()挂起的线程开始执行
		new Thread() {
			public void run() {
				try {
					System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
					Thread.sleep(300);
					System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
					latch.countDown();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
					Thread.sleep(1000);
					System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
					latch.countDown();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
					Thread.sleep(200);
					System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
					latch.countDown();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				try {
					System.out.println("进入主线程   等待两个线程执行完毕---主线程挂起");
					latch.await();					
					System.out.println("主线程开始执行");
					Thread.sleep(300);
					System.out.println("主线程执行完毕");
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}

}
