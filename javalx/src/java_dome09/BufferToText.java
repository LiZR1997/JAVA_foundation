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
		System.out.println(buffer.asCharBuffer());//ֱ��ʹ��asCharBuffer��������룬��Ҫ����ת��
		buffer.rewind();
		String encoding = System.getProperty("file.encoding");//��ȡϵͳ���� �ļ�����
		System.out.println(encoding + " " + Charset.forName(encoding).decode(buffer));//���±���
        fc = new FileOutputStream("D:/javaio/DirList/02.txt").getChannel();
        fc.write(ByteBuffer.wrap("some text".getBytes("UTF-16BE")));//���ñ���ı����ʽ
        fc.close();//�ر�ͨ�����ֽ���
        fc = new FileInputStream("D:/javaio/DirList/02.txt").getChannel();
        buffer.clear();//���buffer���壬���ڴ洢�µ�����
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());//��������ʽ���������
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
