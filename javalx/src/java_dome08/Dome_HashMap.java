package java_dome08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Dome_HashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "1111111");
		hashMap.put(2, "2222222");
		hashMap.put(3, "3333333");
		hashMap.put(4, "4444444");
		HashMap<Integer, String> hashMap2 = (HashMap<Integer, String>) hashMap.clone();
		HashMap<Integer, String> hashMap3 =new HashMap<Integer, String>();
		hashMap3.putAll(hashMap);
		Collection<String> collection = hashMap.values();
		System.out.println(collection);
		for(Entry<Integer, String> entry : hashMap.entrySet())
			{
			System.out.println(entry);
			}
		Iterator<Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
		for(;iterator.hasNext();)
		{
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}
		for(Integer integer : hashMap.keySet())
			System.out.println(integer);

	}

}
