package java_dome10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newSingleThreadExecutor();
		//newSingleThreadExecutor()一次只允许一个线程执行，未执行的线程放入线程就绪队列
		for( int i = 0 ; i < 5 ; i++)
			exec.execute(new LiftOff());
		exec.shutdown();

	}

}
