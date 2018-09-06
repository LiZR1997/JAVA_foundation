package java_dome01;

import java.util.Scanner;

public class dome01_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double sum = 0 ;
		int m = 0 ;
		while( reader.hasNextDouble()){
			double x = reader.nextDouble();
			m = m+1;
			sum = sum + x;
		}
		System.out.printf("%d,%f\n", m , sum );
		
	}

}
