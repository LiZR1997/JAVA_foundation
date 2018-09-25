package java_dome08;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class Dome_Vector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vector<E> �߳��ǰ�ȫ��
		Vector<Integer> vector = new Vector<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		vector.setSize(6);
		System.out.println("����Ԫ�ظ���" + vector.size() + "����" + vector.capacity());
		System.out.println(vector.indexOf(1, 2));
		Iterator<Integer> iterator = vector.iterator();
		for(;iterator.hasNext();)
			System.out.print(iterator.next() + " ");
		System.out.println("");
		Vector<Integer> vector2 = new Vector<Integer>(6);
		vector2.addAll(Arrays.asList(1,2,3,4,5,6));
		for (Integer integer : vector2) {
			System.out.print(integer + " ");
		}
		
		

	}

}
/*
 *�����ڶ��߳��У���������ǰ�ȫ�ģ���ʼ����ʱ��ȡmodCount�޸ĵĴ��������϶�̬�Ļ��modCount ���ж��Ƿ��޸ģ��������޸�
 *�򱨴� 
 *
 * Fail-Fast ���� 
         ����֪�� java.util.HashMap �����̰߳�ȫ�ģ���������ʹ�õ������Ĺ������������߳��޸���map����ô���׳�
   ConcurrentModificationException���������νfail-fast���ԡ���һ������Դ���е�ʵ����ͨ��
   modCount ��modCount ����˼������޸Ĵ�������HashMap ���ݵ��޸Ķ����������ֵ����ô�ڵ�������ʼ��
        �����лὫ���ֵ������������ expectedModCount���ڵ��������У��ж� modCount �� expectedModCount �Ƿ���
        �ȣ��������Ⱦͱ�ʾ�Ѿ��������߳��޸��� Map��ע�⵽ modCount ����Ϊ volatile����֤�߳�֮���޸ĵĿɼ��ԡ�
       ����������ʹ�ҽ��飬����ұ�����Щ���̰߳�ȫ�����ݽṹʱ������ʹ�õ�����

 */