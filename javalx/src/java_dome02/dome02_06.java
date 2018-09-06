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
		LinkedList<Integer> Integers = new LinkedList<Integer>();//LinkedList 中所有的添加只能在元素首尾添加
		Integers.push(1);
		Integers.push(2);
		Integers.push(3);
		Integers.push(4);
		System.out.println(Integers.pop());//弹出栈顶堆栈
		//System.out.println(Integers.getLast());//获取栈底元素
		//System.out.println(Integers.getFirst());//获取栈顶元素，若元素不存在，抛出异常
		while (null != Integers.peekFirst())
			System.out.print("------"+Integers.pop());
		//peekFirst()弹出最后一个元素（栈顶元素）
		//peekLast()弹出第一个一个元素（栈底元素），均不移除元素，若元素不存在，返回值为空
		LinkedList<Integer> rIntegers = new LinkedList<Integer>();
		rIntegers.add(1);
		rIntegers.add(2);
		rIntegers.offer(3);//
		rIntegers.offerFirst(0);//
		rIntegers.offerLast(4);
		//boolean offer(E e)：在链表尾部插入一个元素； 
		//boolean offerFirst(E e)：与addFirst一样，实际上它就是addFirst； 
		//boolean offerLast(E e)：与addLast一样，实际上它就是addLast；成功返回ture
		if(rIntegers.offer(5))
			System.out.println("lex");
		System.out.println(rIntegers);//队列

		
	}

}
