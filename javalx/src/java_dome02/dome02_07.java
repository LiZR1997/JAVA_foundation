package java_dome02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class dome02_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> integers = new ArrayList<Integer>(Arrays.asList(1,2,3,5));
		integers.add(6);
		Collections.sort((List<Integer>)integers);
		int n = Collections.binarySearch((List<Integer>)integers, 2);
		System.out.println(integers);
		Integer[] aIntegers = { 6 , 7 , 8 , 9 ,10};
		Integer[] aIntegers3 = { 11 , 12};
		Iterator<Integer> iterator = integers.iterator();
		for(;iterator.hasNext();)
			System.out.print(iterator.next()+" ");
		System.out.println("\n");
		for(int i = 0 ; i < aIntegers.length ; i++ )
			System.out.print(aIntegers[i]+" ");
		 Integer[] aIntegers2 = integers.toArray(aIntegers);//toArray 填充一个数组并返回该数组若未超过其长度，则返回原数组，超过后重新创建数组
		 System.out.print("\n");
		 //for (Integer integer : aIntegers2)
			//System.out.println(integer);
		//for(int i = 0 ; i < aIntegers.length ; i++ )
			//System.out.print(aIntegers[i]+" ");
		 System.out.println(aIntegers3.toString());
		 for (Integer integer : integers.toArray(aIntegers3))
			 System.out.print(integer);
		System.out.println(integers.toArray(aIntegers3).toString());
		System.out.println(aIntegers.toString());
		for (Integer integer : integers.toArray(aIntegers))
			System.out.print(integer);
		System.out.println(integers.toArray(aIntegers).toString());
		List<Integer> integers2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		Collections.sort(integers2);

	}

}
