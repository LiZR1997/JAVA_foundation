package java_dome09.dome01;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ThawAlien {

	/**
	 * @param args
	 * @throws Exception  
	 */
	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream( "x.file"));
		Object o = objectInputStream.readObject();
		System.out.println(o.getClass());

	}

}
