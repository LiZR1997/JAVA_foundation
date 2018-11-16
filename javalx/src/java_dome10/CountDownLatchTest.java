package java_dome10;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final CountDownLatch latch = new CountDownLatch(3);
		//�κζ������CountDownLatch��await()���ᱻ���� �����̱߳�����
		//CountDownLatch�ڲ�����һ����ʼֵ���߳�ִ��ʱ����countDown()����ʹ��ֵ-1���߳�һ�ε���ֻ�ܼ�һ��
		//�����ú���countDown()�߳�������CountDownLatch�ڲ�����һ����ʼֵʱ�����߳̿�ʼִ��
		// ע�⣡�� �� ���Ǻ��� countDown()�������߳�ִ������Ժ� ��ʼִ�б�await()������̣߳�����ִ����countDown()������
		//��await()������߳̿�ʼִ��
		new Thread() {
			public void run() {
				try {
					System.out.println("���߳�" + Thread.currentThread().getName() + "����ִ��");
					Thread.sleep(300);
					System.out.println("���߳�" + Thread.currentThread().getName() + "ִ�����");
					latch.countDown();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					System.out.println("���߳�" + Thread.currentThread().getName() + "����ִ��");
					Thread.sleep(1000);
					System.out.println("���߳�" + Thread.currentThread().getName() + "ִ�����");
					latch.countDown();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					System.out.println("���߳�" + Thread.currentThread().getName() + "����ִ��");
					Thread.sleep(200);
					System.out.println("���߳�" + Thread.currentThread().getName() + "ִ�����");
					latch.countDown();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				try {
					System.out.println("�������߳�   �ȴ������߳�ִ�����---���̹߳���");
					latch.await();					
					System.out.println("���߳̿�ʼִ��");
					Thread.sleep(300);
					System.out.println("���߳�ִ�����");
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}

}
