package java_dome08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Dome_HashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(Integer integer : Arrays.asList(1,2,3,4,5,6,7,8,1))
			hashSet.add(integer);
		Iterator<Integer> iterator = hashSet.iterator();
		for( ; iterator.hasNext() ; )
			System.out.println(iterator.next());
		System.out.println(hashSet);
		for(Integer integer : hashSet)
			System.out.print(integer + " ");
	}

}
