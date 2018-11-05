package java_dome10;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest implements Runnable{
    public static ReentrantLock lock = new ReentrantLock();
    public static int i = 0;

    @Override
    public void run() {
        for (int j = 0; j < 10000; j++) {
            lock.lock();  // ������Ϳ���
            //lock.lock(); ��
            try {
                i++;
            } finally {
                lock.unlock(); // ������Ϳ���
                //lock.unlock();��
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockTest test = new ReentrantLockTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();t2.start();
//        TimeUnit.MILLISECONDS.sleep(300);
        t1.join(); t2.join(); // main�̻߳�ȴ�t1��t2����������ִ���Ժ������
        /*
         * join()������̰߳�˳��ִ��
         * ��������ʹ��join�������õ���i��������0���� ��С�����֣���Ϊthread��thread1�߳̿��ܻ�
         * û��ʼ���еأ����̳߳���Ͱ�i��ֵ����ˣ�ʹ����join�����󣬱�ʾ������߳�Ը��ȴ�����¼������
         * �̣�ֱ����ִ����
         * */
        System.err.println(i);
    }
}
