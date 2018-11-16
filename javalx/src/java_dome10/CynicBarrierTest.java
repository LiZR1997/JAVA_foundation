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
				System.out.println("��ǰ�߳�" + Thread.currentThread().getName());
				
			}
		});//������Ӷ������Runnable����Ϊִ����ɺ�Ĳ���
		   // CyclicBarrier���Ա�����
		ReentrantLock rLock = new ReentrantLock();
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д������");
		        try {
					TimeUnit.MILLISECONDS.sleep(1000);
					System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д���������");
					barrier.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        System.out.println("�߳�:  " + Thread.currentThread().getName() + "������ִ����ϣ���ʼ��������");
		        
			}
		});
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д������");
				try {
					TimeUnit.MILLISECONDS.sleep(2000);
					System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д���������");
					barrier.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("�߳�:  " + Thread.currentThread().getName() + "������ִ����ϣ���ʼ��������");
				
			}
		});
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д������");
				try {
					TimeUnit.MILLISECONDS.sleep(2000);
					System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д���������");
					barrier.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("�߳�:  " + Thread.currentThread().getName() + "������ִ����ϣ���ʼ��������");
				
			}
		});
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д������");
				try {
					TimeUnit.MILLISECONDS.sleep(200);
					System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д���������");
					barrier.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("�߳�:  " + Thread.currentThread().getName() + "������ִ����ϣ���ʼ��������");
				
			}
		});
		exec.shutdown();
//		for(int i = 0 ; i < 4 ; i++)
//		exec.execute(new barrierTest(barrier,rLock));
//			exec.execute(new barrierTest(barrier));
//		exec.shutdown();
		//���������̵߳�˳��ִ��
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
//			System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д������");
//			try {
//				TimeUnit.MILLISECONDS.sleep(2000);
//				System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д���������");
//				barrier.await();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (BrokenBarrierException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("�߳�:  " + Thread.currentThread().getName() + "������ִ����ϣ���ʼ��������");
//		rLock.unlock();
//		
//	}
	
	public void run() {
		// TODO Auto-generated method stub
		synchronized(barrierTest.class) {
			System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д������");
			try {
				TimeUnit.MILLISECONDS.sleep(2000);
				System.out.println("�߳�:  " + Thread.currentThread().getName() + "����д���������");
				barrier.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�߳�:  " + Thread.currentThread().getName() + "������ִ����ϣ���ʼ��������");
		}
		
	}
	
}
