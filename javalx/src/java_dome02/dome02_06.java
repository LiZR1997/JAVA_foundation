package java_dome02;

import java.util.LinkedList;
import java.util.List;

public class dome02_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		LinkedList<Integer> Integers = new LinkedList<Integer>();//LinkedList �����е����ֻ����Ԫ����β���
		Integers.push(1);
		Integers.push(2);
		Integers.push(3);
		Integers.push(4);
		System.out.println(Integers.pop());//����ջ����ջ
		//System.out.println(Integers.getLast());//��ȡջ��Ԫ��
		//System.out.println(Integers.getFirst());//��ȡջ��Ԫ�أ���Ԫ�ز����ڣ��׳��쳣
		while (null != Integers.peekFirst())
			System.out.print("------"+Integers.pop());
		//peekFirst()�������һ��Ԫ�أ�ջ��Ԫ�أ�
		//peekLast()������һ��һ��Ԫ�أ�ջ��Ԫ�أ��������Ƴ�Ԫ�أ���Ԫ�ز����ڣ�����ֵΪ��
		LinkedList<Integer> rIntegers = new LinkedList<Integer>();
		rIntegers.add(1);
		rIntegers.add(2);
		rIntegers.offer(3);//
		rIntegers.offerFirst(0);//
		rIntegers.offerLast(4);
		//boolean offer(E e)��������β������һ��Ԫ�أ� 
		//boolean offerFirst(E e)����addFirstһ����ʵ����������addFirst�� 
		//boolean offerLast(E e)����addLastһ����ʵ����������addLast���ɹ�����ture
		if(rIntegers.offer(5))
			System.out.println("lex");
		System.out.println(rIntegers);//����

		
	}

}
