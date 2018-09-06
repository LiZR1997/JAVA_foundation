package java_dome02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class dome02_04 {

	 Integer binarySearch(Integer[] a,int ze ) {
		int n = 0 ,temp = 0 ,hight ,low = 0 ,mind = -1;
		for (int i = 0 ; i<a.length ; i++)
		{
			for (int j = a.length-1 ; j > i ; j--)
				if(a[j] <= a[j-1])
				{
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			if(temp == 0) break;
		}
		hight = a.length-1;
		while(hight >= low) {
			mind = (hight + low)/2;
			if(a[mind] > ze)
				low = mind + 1;
			else  if(a[mind] < ze)
				hight = mind - 1;
			else break;
		}
		return mind;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dome02_04 dome = new dome02_04();
		Integer[] integers = {1 , 2 , 3 , 5 , 9 , 6 , 3 };
		int a1 = Arrays.binarySearch(integers, 9);
		//Arrays的 binarySearch() 方法
		System.out.print(a1+" ");
		int a2 = dome.binarySearch( integers , 9);
		//自己手写的二分查找
		System.out.print(a2);
		List<Integer> integers2 = new ArrayList<Integer>(Arrays.asList(integers));
		//Arrays的asList()方法,将接受任意的数组为参数，将其转变为 List 容器
		System.out.print(integers2);
		

	}

}
