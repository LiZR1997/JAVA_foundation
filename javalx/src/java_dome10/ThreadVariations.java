package java_dome10;

import java.util.concurrent.TimeUnit;

class InnerThread1 {
	private int countDown = 5 ;
	private Inner inner;
	private class Inner extends Thread {
		//ֱ�Ӽ̳�Threadʵ�ֶ��̣߳������ڲ���
		public Inner(String name) {
			// TODO Auto-generated constructor stub
			super(name);//���ʸ����еĹ��췽���������̵߳�����
			start();//�����߳�
		}
		public void run() {
			while(true) {
				System.out.println(this);
				if(--countDown == 0 ) return ;
				try {
					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		public String toString() {
			return getName() + ":" +countDown;//getName()���������ص�ǰ�������
		}
	}
	public InnerThread1(String name) {
		inner = new Inner(name);//���������ڲ���
	}
	
}

class InnerThread2 {
	private int countDown = 5 ;
	private Thread thread;
	public InnerThread2(String name) {
		thread = new Thread(name) { //��дThread������ת��
			public void run() {
				while(true) {
					System.out.println(this);
					if(--countDown == 0 ) return ;
					try {
						sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
	}
	 
}

//��������ʹ�õ���Runnable�ӿڶ���Thread��
class InnerRunnable1 {
	private int countDown = 5 ;
	private Inner inner;
	private class Inner implements Runnable {//�����һ�ֱ��壬ֱ����Runnable��ʵ�����У�������������߳�

		Thread thread;
		public Inner(String name) {
			thread = new Thread(this , name);//this Ϊʵ��Runnable���ڲ���
			thread.start();
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				System.out.println(this);
				if(--countDown == 0 ) return ;
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		public String toString() {
			return thread.getName() + ":" +countDown;
		}	
	}
	public InnerRunnable1(String name) {
		inner = new Inner(name);
	}
}

class InnerRunnable2 {
	private int countDown = 5 ;
	private Thread thread;
	public InnerRunnable2(String name) {
		thread = new Thread(new Runnable() {//ֱ��ΪThread����Runnable����new RunnableΪ�����ڲ���
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(this);
				if(--countDown == 0) return ;
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			public String toString() {
				return Thread.currentThread().getName() + ";"
						+ countDown;
			}
		},
			name	);
		thread.start();
	}
	
	
}

class ThreadMethod {//�ڷ����ڲ���δ����߳�
	private int countDown = 5;
	private Thread thread;
	private String name;
	public ThreadMethod(String name) {
		this.name = name;
	}
	public void runTask() {
		if(thread == null) {
			thread = new Thread(name) {
				public void run() {
					while(true) {
						System.out.println(this);
						if(--countDown == 0 ) return ;
						try {
							sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			};
			thread.start();
		}
	}
}

public class ThreadVariations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerThread1("InnerThread1");
		new InnerThread2("InnerThread2");
		new InnerRunnable1("InnerRunnable1");
		new InnerRunnable2("InnerRunnable2");
		new ThreadMethod("ThreadMethod").runTask();

	}

}
