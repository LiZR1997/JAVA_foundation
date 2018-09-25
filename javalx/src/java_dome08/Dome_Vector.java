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
		//Vector<E> 线程是安全的
		Vector<Integer> vector = new Vector<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		vector.setSize(6);
		System.out.println("所含元素个数" + vector.size() + "容量" + vector.capacity());
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
 *所以在多线程中，迭代输出是安全的，开始迭代时获取modCount修改的次数，不断动态的获得modCount ，判断是否修改，若发生修改
 *则报错 
 *
 * Fail-Fast 机制 
         我们知道 java.util.HashMap 不是线程安全的，因此如果在使用迭代器的过程中有其他线程修改了map，那么将抛出
   ConcurrentModificationException，这就是所谓fail-fast策略。这一策略在源码中的实现是通过
   modCount 域，modCount 顾名思义就是修改次数，对HashMap 内容的修改都将增加这个值，那么在迭代器初始化
        过程中会将这个值赋给迭代器的 expectedModCount。在迭代过程中，判断 modCount 跟 expectedModCount 是否相
        等，如果不相等就表示已经有其他线程修改了 Map：注意到 modCount 声明为 volatile，保证线程之间修改的可见性。
       所以在这里和大家建议，当大家遍历那些非线程安全的数据结构时，尽量使用迭代器

 */