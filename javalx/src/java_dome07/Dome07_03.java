package java_dome07;

import java.util.Arrays;
import java.util.Random;
public class Dome07_03 {

	/**
	 * @´Ö²ÚÊý×é
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(47);
		int [][][] a = new int[random.nextInt(9)][][];
		for(int i = 0 ; i < a.length ; i++ )
		{
			a[i] = new int[random.nextInt(10)][];
			for( int  j = 0 ; j < a[i].length ; j++)
			{
				a[i][j] = new int[random.nextInt(6)];
				for(int k = 0 ; k <a[i][j].length ; k++)
					a[i][j][k] = 1;
			}
		}
		
		System.out.println(Arrays.deepToString(a));
		

	}

}
