package java_dome08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dome_ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> arrayList0 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		List<Integer> arrayList = new ArrayList<Integer>(arrayList0);
		for (Integer integer : arrayList)
			System.out.print(integer + " ");
		for (Integer integer : arrayList0)
			System.out.print(integer + " ");
	   arrayList.set(1, null);
//	   arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
//	   for (Integer integer : arrayList)
//			System.out.print(integer + " ");
	   System.out.println(arrayList.indexOf(null));
	   ArrayList<Integer> integers = new ArrayList<Integer>(arrayList0);
	   ArrayList<Integer> re = (ArrayList<Integer>) integers.clone();
	   re.remove(2);          //删除指定位置的元素
	   re.addAll(integers);
	   for (Integer integer : re) {
		System.out.print(integer);
	}
	   System.out.println();
	  Integer a[] = new Integer[6];
	  a = integers.toArray(a);//返回数组
	  for(int i = 0 ; i < 10 ; i++)
		  System.out.print(a[i]);
	   
	}

}
