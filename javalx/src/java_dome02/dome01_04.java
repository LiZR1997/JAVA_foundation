package java_dome02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Arrays.asList()的使用方法
 *         Collections.addAll()的使用方法
 * */

public class dome01_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5,6));
		Integer [] integers = {7 , 8 , 9 , 10};
		collection.addAll(Arrays.asList(integers));
		System.out.println(collection);
		for (Integer integer : collection) {
			System.out.println(integer);
		}
	}

}
