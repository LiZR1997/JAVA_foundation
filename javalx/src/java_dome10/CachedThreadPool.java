package java_dome10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0 ; i < 5 ; i++)
			exec.execute(new LiftOff());
		exec.shutdown();//使用它将使所有进程在完成任务后尽快退出，防止新任务被提交
		exec.execute(new LiftOff());		

	}

}
