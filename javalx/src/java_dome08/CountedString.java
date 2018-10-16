package java_dome08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountedString {

	/**
	 * @param args
	 */
	private static List<String> created = new ArrayList<String>();
	
	private String s ;
	
	private int id = 0 ;
	
	public CountedString(String str) {
		s = str;
		created.add(s);
		for(String string : created)
			if( string.equals( s ) )
				id ++ ;
	}
	
	public String toString() {
		return "String()" + s + "id" + id + "hashCode" + hashCode();
	}
	
	public int hashCode() {
		int result = 17;
		result = result*37 + s.hashCode();
		result = result*37 + id;
		return result;
	}
	
	public boolean equles( Object o ) {
		return o instanceof CountedString && s.equals(((CountedString)o).s) && id == ((CountedString)o).id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<CountedString, Integer> map = new HashMap<CountedString, Integer>();
		CountedString[] cs = new CountedString[5];
		int i = 0;
		for(CountedString countedString : cs)
		{
			cs[i] = new CountedString("hi");
			map.put(cs[i], i++);
		}
		System.out.println(map);
		for(CountedString countedString : cs)
		{
			System.out.println("Looking up" + countedString);
			System.out.println(map.get(countedString));
		}
		

	}

}
