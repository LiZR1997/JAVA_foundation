package java_dome08;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Vector;

public class cc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		Hashtable<String, Vector<String>> hashtable = new Hashtable<String, Vector<String>>();
		for(int i = 0 ; i < 6 ; i++)
			vector.add(i + " ");
		hashtable.put("1", vector);
		hashtable.put("2", new Vector<String>(Arrays.asList("12" , "16")));
		Iterator<Entry<String, Vector<String>>> iterator = hashtable.entrySet().iterator();

		for(;iterator.hasNext();)
//			for(;;)
			{
			int i = 0;
			Entry<String, Vector<String>> entry = iterator.next();
			System.out.println(entry.getKey());
			for(Vector<String> vector2 = entry.getValue();i  < vector2.size(); i++)
				System.out.print(vector2.get(i));
				;
			}
		

	}

}
