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
				while(restaurant.meal == null)//mealΪ�գ������̹߳���WaitPerson
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
		while(!Thread.interrupted()) {//Thread.interrupted()�ж��Ƿ�������
			try {
			synchronized(this) {//synchronized��ס��Ϊ��ǰ�Ķ������һ�����̷���ĳ��synchronized���ʿ��ƿ�
				                //�����������޷����ʸö��������еĵ�����synchronized��
				while(restaurant.meal != null)		
						wait();
			}
		} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		if(++count == 10) {//ִ��ʮ�Σ���ֹ
			System.out.println("Order up!");
			restaurant.exec.shutdownNow();
		}
		synchronized(restaurant.waitPerson) {//ʹ����WaitPerson��synchronized(this)���ֻ���
			//������Ҫ�ڵ���wait()����notify()֮ǰ������ʹ��synchronized�����ס��wait/notify�Ķ���
			restaurant.meal = new Meal(count);
			restaurant.waitPerson.notifyAll();//����waitPerson����
		}
		try {
			TimeUnit.MILLISECONDS.sleep(100);//�ȴ�ʱ��
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
	WaitPerson waitPerson = new WaitPerson(this);//��������
	Chef chef = new Chef(this);
	public Restaurant() {
		exec.execute(waitPerson);
		exec.execute(chef);//�����߳�
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Restaurant();
	}

}
