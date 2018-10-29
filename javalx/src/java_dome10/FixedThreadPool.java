package java_dome10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newFixedThreadPool(5);
		//一次所能执行的的最大进程数
		for(int i = 0 ; i < 6 ; i++)
			exec.execute(new LiftOff());
		exec.execute(new LiftOff());
		exec.shutdown();//使用它将使所有进程在完成任务后尽快退出，防止新任务被提交
	}

}
