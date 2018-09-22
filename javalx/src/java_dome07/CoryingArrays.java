package java_dome07;

import java.util.Arrays;

public class CoryingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1 = new int[7];
		int [] a2 = new int[10];
		Arrays.fill(a1, 1);
		Arrays.fill(a2, 2);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.arraycopy(a1, 0, a2, 0, a1.length);
		System.out.println(Arrays.toString(a2));
		Integer [] b1 = new Integer[7];
		Integer [] b2 = new Integer[10];
		Arrays.fill(b1, new Integer(3));
		Arrays.fill(b2, new Integer(4));
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		System.arraycopy(b1, 0, b2, 0, b1.length);
		System.out.println(Arrays.toString(b2));
		Cd [] c1 = new Cd[6];
		Cd [] c2 = new Cd[3];
		for(int i = 0 ; i < c1.length ; i++)
			c1[i] = new Cd(i);
		for(int i = 0 ; i < c2.length ; i++)
		c2[i] = new Cd(99);
		System.arraycopy(c2, 0, c1, 0, c2.length);
	}

}
