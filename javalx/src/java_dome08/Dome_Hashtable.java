package java_dome08;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class Dome_Hashtable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		Hashtable<Integer, String> hashtable2 = new Hashtable<Integer, String>();
		System.out.println(Float.isNaN(0.0f/0.0f));	
		hashtable.put(1, "111111");
		hashtable.put(1, "111111");
		hashtable.put(2, "222222");
		hashtable.put(3, "333333");
		hashtable.put(4, "444444");
		System.out.println(hashtable.contains("111111"));
		Iterator<Entry<Integer, String>> iterator = hashtable.entrySet().iterator();
		for(;iterator.hasNext();)
		System.out.println(iterator.next());
		hashtable2.putAll(hashtable);
		Iterator<Integer> iterator1 = hashtable.keySet().iterator();
		for( ; iterator1.hasNext() ; )
		System.out.println(iterator1.next());
		System.out.println(hashtable2.entrySet().contains(hashtable2));
		for(Entry<Integer, String> entry : hashtable2.entrySet())
			System.out.println(entry);
		System.out.println(hashtable.toString());

	}

}
