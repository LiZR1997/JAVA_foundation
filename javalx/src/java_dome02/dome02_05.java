package java_dome02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class dome02_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(1,2,3,5,2,5));
		System.out.println(integers);
		integers.add(60);//ArrayList ��add()��������β�����Ԫ��
		System.out.println(integers);
		integers.set(1, 6);//ArrayList ��set()�������޸�ָ��λ��Ԫ�صķ��� ��get()ȡ��ָ��λ�õ�Ԫ��
		System.out.println(integers+" "+integers.get(1));
		System.out.println(integers.contains(2));//������б��а���ָ����Ԫ�أ��򷵻� true�� 
		integers.remove(1);//remove()�Ƴ����б���ָ��λ���ϵ�Ԫ�ء� 
		System.out.println(integers);
		//Integer[] a = (Integer[]) integers.toArray();//���ʵ�˳�򣨴ӵ�һ�������һ��Ԫ�أ����ذ������б�������Ԫ�ص����顣
		Iterator<Integer> iterator = integers.iterator();
		for( ; iterator.hasNext() ;)
			System.out.println(iterator.next());
		for (Integer integer : integers)
			System.out.println(integer);
		for (int i = 0; i < integers.size(); i++)
			System.out.println(integers.get(i));


	}

}
