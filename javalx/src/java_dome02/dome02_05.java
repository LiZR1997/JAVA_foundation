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
		integers.add(60);//ArrayList 的add()方法，在尾部添加元素
		System.out.println(integers);
		integers.set(1, 6);//ArrayList 的set()方法，修改指定位置元素的方法 ，get()取出指定位置的元素
		System.out.println(integers+" "+integers.get(1));
		System.out.println(integers.contains(2));//如果此列表中包含指定的元素，则返回 true。 
		integers.remove(1);//remove()移除此列表中指定位置上的元素。 
		System.out.println(integers);
		//Integer[] a = (Integer[]) integers.toArray();//按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组。
		Iterator<Integer> iterator = integers.iterator();
		for( ; iterator.hasNext() ;)
			System.out.println(iterator.next());
		for (Integer integer : integers)
			System.out.println(integer);
		for (int i = 0; i < integers.size(); i++)
			System.out.println(integers.get(i));


	}

}
