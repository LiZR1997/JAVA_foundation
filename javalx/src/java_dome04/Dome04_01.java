package java_dome04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dome04_01 {

	public String toString() {
		return "µÿ÷∑"+this;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		for(int i = 0 ; i < 10 ; i++)
		list.add("i");
		Iterator<String> iterator = list.iterator();
		for(;iterator.hasNext();)
			System.out.println(iterator.next().toString());
        System.out.println(list.toString());
	}

}
