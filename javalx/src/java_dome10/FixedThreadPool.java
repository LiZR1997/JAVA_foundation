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
		//һ������ִ�еĵ���������
		for(int i = 0 ; i < 6 ; i++)
			exec.execute(new LiftOff());
		exec.execute(new LiftOff());
		exec.shutdown();//ʹ������ʹ���н������������󾡿��˳�����ֹ�������ύ
	}

}
