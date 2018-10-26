package java_dome09.dome01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Blips {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("");
		Blip1 blip1 = new Blip1();
		Blip2 blip2 = new Blip2();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("Blips.out"));
		System.out.println("");
		objectOutputStream.writeObject(blip1);
		objectOutputStream.writeObject(blip2);
		objectOutputStream.close();
		ObjectInputStream objectInputStream = new ObjectInputStream(new 
				FileInputStream("Blips.out"));
		System.out.println("");
		blip1 = (Blip1) objectInputStream.readObject();
		

	}

}
