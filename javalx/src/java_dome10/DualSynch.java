package java_dome10;

public class DualSynch {
	
	private Object syncObject = new Object();
	public synchronized void f() {
		for(int i = 0 ; i < 5 ; i++ )
		{
			System.out.println("f()");
			Thread.yield(); 
			//ʹ��ǰ�̴߳�ִ��״̬������״̬����Ϊ��ִ��̬������״̬��
			//Ȼ��cpu�Ӿ���̬��������ѡһ������ִ��
		}
	}
	
//	public void g() {
	public synchronized void g() { //����ͬ����f()ִ����ɺ�g()��ִ��
//		synchronized(syncObject) {//���̿��ƿ飬ͬʱִ��
			for( int i = 0 ; i < 5 ; i++ )
			{
				System.out.println("g()");
				Thread.yield();
			}
//		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final DualSynch dualSynch = new DualSynch();
		new Thread() {
			public void run() {
				dualSynch.f();
			}
			
		}.start();
		dualSynch.g();

	}

}
