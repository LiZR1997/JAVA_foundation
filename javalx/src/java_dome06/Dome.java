package java_dome06;

import java.util.Random;

public class Dome implements Generator<String>{
	private static int i = 0 ;
	@Override
	public String next() {
		// TODO Auto-generated method stub
//		Random random = new Random(66);
		return "c" + i++;
	}

}
