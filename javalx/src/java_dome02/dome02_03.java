package java_dome02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() { return id ; }
}

class Apple1 extends Apple {}
class Apple2 extends Apple {}

public class dome02_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Apple> apples = new ArrayList<Apple>();
		for( int i = 0 ; i < 3 ; i++ )
		{
			apples.add(new Apple());
		}
		apples.set(2, new Apple());
		for( int i = 0; i < apples.size() ; i++)
		{
			System.out.println(apples.get(i).id());
		}
		for(Apple c : apples)
			System.out.println(c.id());// foreach Êä³ö
		ArrayList<Apple> app = new ArrayList<Apple>();
			app.add(new Apple1());
			app.add(new Apple2());
		for (Apple ap : app) {
			System.out.println(ap);
		}
		List<Integer> collections = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			collections.add(i);
		}
		int i = 10 , k = 0;
		for (Integer integer : collections) {
			collections.set(integer, i--);
		}
		for (Integer integer : collections) {
			System.out.println(integer);
		}
	}

}
