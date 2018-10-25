package java_dome09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class BufferToText {

	/**
	 * @param args
	 */
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileChannel fc = new FileOutputStream("D:/javaio/DirList/02.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();
		fc = new FileInputStream("D:/javaio/DirList/02.txt").getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		fc.read(buffer);
		buffer.flip();
		System.out.println(buffer.asCharBuffer());//直接使用asCharBuffer会产生乱码，需要进行转码
		buffer.rewind();
		String encoding = System.getProperty("file.encoding");//获取系统变量 文件编码
		System.out.println(encoding + " " + Charset.forName(encoding).decode(buffer));//重新编码
        fc = new FileOutputStream("D:/javaio/DirList/02.txt").getChannel();
        fc.write(ByteBuffer.wrap("some text".getBytes("UTF-16BE")));//设置保存的编码格式
        fc.close();//关闭通道的字节流
        fc = new FileInputStream("D:/javaio/DirList/02.txt").getChannel();
        buffer.clear();//清空buffer缓冲，便于存储新的数据
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());//保存编码格式后，输出正常
        fc = new FileOutputStream("D:/javaio/DirList/02.txt").getChannel();
        buffer = ByteBuffer.allocate(24);
        buffer.asCharBuffer().put("some text");
        fc.write(buffer);
        fc.close();
        fc = new FileInputStream("D:/javaio/DirList/02.txt").getChannel();
        buffer.clear();
        fc.read(buffer);
        buffer.flip();
        System.out.println(" " + buffer.asCharBuffer());
	}

}
