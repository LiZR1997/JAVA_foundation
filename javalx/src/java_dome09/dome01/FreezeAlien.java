package java_dome09.dome01;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class FreezeAlien {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectOutput objectOutput = new ObjectOutputStream(
				new FileOutputStream("x.file "));
		Alien qAlien = new Alien();
		objectOutput.writeObject(qAlien);
	}

}
