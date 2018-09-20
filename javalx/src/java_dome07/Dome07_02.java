package java_dome07;

import java.util.Arrays;
import java.util.Random;

public class Dome07_02 {

	/**
	 * @param args
	 */
	private static Random random = new Random(47);
	static final String[] strings = {"酸" , "甜" , "苦" , "辣" , "咸"};
	public static String[] flavoSet(int n) {
		if( n > strings.length)
			throw new IllegalArgumentException("超出数组大小");
		String[] string1 = new String[n];
		boolean pb[] = new boolean[strings.length];
		for(int i = 0 ; i < n ; i++)
		{
			int t;
			do
				t = random.nextInt(strings.length);
			while(pb[t]);
			string1[i] = strings[t];
			pb[t] = true;
		}
		return string1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		for(int i = 0 ; i < 5 ; i++)
			System.out.println(Arrays.toString(flavoSet(3)));

	}

}
