package java_dome10;

import java.util.concurrent.TimeUnit;

class InnerThread1 {
	private int countDown = 5 ;
	private Inner inner;
	private class Inner extends Thread {
		//直接继承Thread实现多线程，匿名内部类
		public Inner(String name) {
			// TODO Auto-generated constructor stub
			super(name);//访问父类中的构造方法，传递线程的名字
			start();//启动线程
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
			return getName() + ":" +countDown;//getName()方法，返回当前类的名字
		}
	}
	public InnerThread1(String name) {
		inner = new Inner(name);//创建声明内部类
	}
	
}

class InnerThread2 {
	private int countDown = 5 ;
	private Thread thread;
	public InnerThread2(String name) {
		thread = new Thread(name) { //重写Thread，向上转型
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

//这两个类使用的是Runnable接口而非Thread类
class InnerRunnable1 {
	private int countDown = 5 ;
	private Inner inner;
	private class Inner implements Runnable {//编码的一种变体，直接在Runnable的实现类中，将其自身加入线程

		Thread thread;
		public Inner(String name) {
			thread = new Thread(this , name);//this 为实现Runnable的内部类
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
		thread = new Thread(new Runnable() {//直接为Thread返回Runnable对象，new Runnable为匿名内部类
			
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

class ThreadMethod {//在方法内部如何创建线程
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
