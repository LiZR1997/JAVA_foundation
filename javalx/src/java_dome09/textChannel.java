package java_dome09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class textChannel {

	/**
	 * @param args
	 * @throws IOException 
	 */
	private static final int SIZE = 1024;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileChannel fl = new FileOutputStream("D:/javaio/DirList/02.txt").getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(SIZE);
//		fl.write(ByteBuffer.wrap("นใ".getBytes("UTF-16BE")));
		buffer.asCharBuffer().put("นใ");
		fl.write(buffer);
		fl.close();
		fl = new FileInputStream("D:/javaio/DirList/02.txt").getChannel();
		fl.read(buffer);
		buffer.flip();
		System.out.println(buffer.asCharBuffer());
		

	}

}
