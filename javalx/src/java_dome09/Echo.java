package java_dome09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String sl;
		while ( (sl = bufferedReader.readLine()) != null && sl.length() != 0 ) {
			System.out.print(sl.toUpperCase());//将字符串小写转换为大写
		}

	}

}
