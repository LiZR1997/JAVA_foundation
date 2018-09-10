package java_dome06;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {

	/**
	 * @param args
	 */
	 
	private ArrayList<T> storage = new ArrayList<T>();
	private Random random = new Random(47);
	public void add(T item) {
		storage.add(item);
	}
	public T select() {
		return storage.get(random.nextInt(storage.size()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomList<String> rs = new RandomList<String>();
		for(String s:("1111 11 111 1 1 11 1111").split(" "))
				rs.add(s);
		for(int i = 0 ; i < 11 ; i++)
			System.out.println(rs.select());
	}

}
