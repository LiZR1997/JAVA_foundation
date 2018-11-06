package java_dome10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Car {
	private boolean waxOn = false;

	public synchronized void waxed() {
		waxOn = true;
		notifyAll();
	}
	
	public synchronized void buffed() {
		waxOn = false;
		notifyAll();
	}
	
	public synchronized void waitForWaxing() throws
	InterruptedException {
		while (waxOn == false) {
			wait();
		}
	}
	
	public synchronized void waitForBuffing() throws
    InterruptedException {
		while(waxOn == true) { //whlie ѭ�����waxOn��״̬
			wait();
		}
	}
}

class WaxOn implements Runnable {//����
	private Car car;

	public WaxOn(Car c) {
		car = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!Thread.interrupted()) {//Thread.interrupted()�ж��Ƿ����ж�״̬
			System.out.println("Wax On!");
			try {
				TimeUnit.MILLISECONDS.sleep(200);
				car.waxed();//�ı�waxOn��״̬
				car.waitForBuffing();//������
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class WaxOff implements Runnable {//�׹�
	private Car car;

	public WaxOff(Car c) {
		car = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!Thread.interrupted()) {
			try {
				car.waitForWaxing();//���ȱ�����
				System.out.println("Wax Off!");
				TimeUnit.MILLISECONDS.sleep(200);
				car.buffed();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}

public class WaxOMatic {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Car car = new Car();
		ExecutorService exec = Executors
				.newCachedThreadPool();
		exec.execute(new WaxOff(car));
		exec.execute(new WaxOn(car));
		TimeUnit.SECONDS.sleep(2);
		exec.shutdown();

	}

}
