package java_dome08;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class Dome_SortedSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> sortedSet = new TreeSet<String>();
		Collections.addAll(sortedSet, "1 09 91 15 61 18 81".split(" "));
		System.out.println(sortedSet);
		System.out.println(sortedSet.first() + " " + sortedSet.last());

	}

}
