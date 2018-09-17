package java_dome06;

import java.util.ArrayList;
import java.util.Collection;

public class Dome06_10 {

	/**
	 * @param args
	 */
	public static <T> Collection<T> fill(Collection<T> coll , Generator<T> gen ,int n) {
		for( int i = 0 ; i < n ; i++)
			coll.add(gen.next());
		return coll;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> domes = fill(new ArrayList<String>(), new Dome(), 4);
		for(String d : domes)
			System.out.print(" " + d);
		Collection<Integer> dome = fill(new ArrayList<Integer>(), new Fibonacci(), 6);
				for(Integer integer : dome)
			    System.out.print(" " + integer);

	}

}
