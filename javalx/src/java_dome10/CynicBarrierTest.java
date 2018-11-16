package java_dome10;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class CynicBarrierTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4 ;
		ExecutorService exec = Executors.newCachedThreadPool();
		final CyclicBarrier barrier = new CyclicBarrier(N , new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("当前线程" + Thread.currentThread().getName());
				
			}
		});//可以添加额外参数Runnable，作为执行完成后的操作
		   // CyclicBarrier可以被重用
		ReentrantLock rLock = new ReentrantLock();
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据");
		        try {
					TimeUnit.MILLISECONDS.sleep(1000);
					System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据完毕");
					barrier.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        System.out.println("线程:  " + Thread.currentThread().getName() + "该任务执行完毕，开始其他任务");
		        
			}
		});
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据");
				try {
					TimeUnit.MILLISECONDS.sleep(2000);
					System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据完毕");
					barrier.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("线程:  " + Thread.currentThread().getName() + "该任务执行完毕，开始其他任务");
				
			}
		});
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据");
				try {
					TimeUnit.MILLISECONDS.sleep(2000);
					System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据完毕");
					barrier.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("线程:  " + Thread.currentThread().getName() + "该任务执行完毕，开始其他任务");
				
			}
		});
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据");
				try {
					TimeUnit.MILLISECONDS.sleep(200);
					System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据完毕");
					barrier.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("线程:  " + Thread.currentThread().getName() + "该任务执行完毕，开始其他任务");
				
			}
		});
		exec.shutdown();
//		for(int i = 0 ; i < 4 ; i++)
//		exec.execute(new barrierTest(barrier,rLock));
//			exec.execute(new barrierTest(barrier));
//		exec.shutdown();
		//不适用于线程的顺序执行
	}
	
	

}

class barrierTest implements Runnable{
	
	private CyclicBarrier barrier;
	private ReentrantLock rLock;


	public barrierTest(CyclicBarrier barrier, ReentrantLock rLock) {
		this.barrier = barrier;
		this.rLock = rLock;
	}


	public barrierTest(CyclicBarrier barrier) {
		this.barrier = barrier;
	}


	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		rLock.lock();
//			System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据");
//			try {
//				TimeUnit.MILLISECONDS.sleep(2000);
//				System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据完毕");
//				barrier.await();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (BrokenBarrierException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("线程:  " + Thread.currentThread().getName() + "该任务执行完毕，开始其他任务");
//		rLock.unlock();
//		
//	}
	
	public void run() {
		// TODO Auto-generated method stub
		synchronized(barrierTest.class) {
			System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据");
			try {
				TimeUnit.MILLISECONDS.sleep(2000);
				System.out.println("线程:  " + Thread.currentThread().getName() + "正在写入数据完毕");
				barrier.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("线程:  " + Thread.currentThread().getName() + "该任务执行完毕，开始其他任务");
		}
		
	}
	
}
