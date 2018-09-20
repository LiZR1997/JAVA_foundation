package java_dome07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class c {
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return "µÚ" + id;
	}
}

public class Dome07_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c[] cs = new c[10];
		System.out.println(cs.length);
		for(int i = 0 ; i < 10 ; i++)
			cs[i] = new c();
		System.out.println(Arrays.toString(cs));
		System.out.println(cs[6]);
		List<c> cs2 = new ArrayList<c>();		
		System.out.println(cs2.size());
		for(int i = 0 ; i < 10 ; i ++)
			cs2.add(new c());
		System.out.println(cs2.size());
		System.out.println(cs2);
		System.out.println(cs2.get(5));
		char[] cs3 = new char[10];
		System.out.println(cs3[6]);
	}

}
