package java_dome10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Meal {
	private final int orderNum;

	public Meal(int orderNum) {
		this.orderNum = orderNum;
	}
	public String toString() {
		return "Meal" + orderNum;
	}
}

class WaitPerson implements Runnable {

	private Restaurant restaurant;	
	
	public WaitPerson(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		while(!Thread.interrupted()) {
			synchronized(this) {
				while(restaurant.meal == null)//meal为空，将该线程挂起WaitPerson
						wait();			
			}
			System.out.println("Waitperson got" + restaurant.meal);
		synchronized(restaurant.chef) {
			restaurant.meal = null;
			restaurant.chef.notifyAll();
		}
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class Chef implements Runnable {
	private Restaurant restaurant;
	private int count = 0;
	public Chef(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!Thread.interrupted()) {//Thread.interrupted()判断是否发生阻塞
			try {
			synchronized(this) {//synchronized锁住的为当前的对象，如果一个进程访问某个synchronized访问控制块
				                //则其他进程无法访问该对象所持有的的所有synchronized块
				while(restaurant.meal != null)		
						wait();
			}
		} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		if(++count == 10) {//执行十次，终止
			System.out.println("Order up!");
			restaurant.exec.shutdownNow();
		}
		synchronized(restaurant.waitPerson) {//使地与WaitPerson的synchronized(this)保持互斥
			//就是需要在调用wait()或者notify()之前，必须使用synchronized语义绑定住被wait/notify的对象
			restaurant.meal = new Meal(count);
			restaurant.waitPerson.notifyAll();//激活waitPerson进程
		}
		try {
			TimeUnit.MILLISECONDS.sleep(100);//等待时间
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

public class Restaurant {

	Meal meal;
	ExecutorService exec = Executors.newCachedThreadPool();
	WaitPerson waitPerson = new WaitPerson(this);//两个对象
	Chef chef = new Chef(this);
	public Restaurant() {
		exec.execute(waitPerson);
		exec.execute(chef);//两个线程
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Restaurant();
	}

}
