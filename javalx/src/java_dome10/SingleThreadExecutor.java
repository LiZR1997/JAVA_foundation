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
		//newSingleThreadExecutor()һ��ֻ����һ���߳�ִ�У�δִ�е��̷߳����߳̾�������
		for( int i = 0 ; i < 5 ; i++)
			exec.execute(new LiftOff());
		exec.shutdown();

	}

}
