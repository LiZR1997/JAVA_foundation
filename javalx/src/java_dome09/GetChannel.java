package java_dome09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {

	/**
	 * @param args
	 */
	
	private static final int BSIZE = 1024;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileChannel fChannel = new FileOutputStream("D:/javaio/DirList/02.txt").getChannel();
		//����ͨ�������ֽ����������������Reader��Writer���ڲ��ݵ����ַ����ܲ���ͨ��
		fChannel.write(ByteBuffer.wrap("qwertyuiop".getBytes()));
		//ת��Ϊ�ֽ���д��
		fChannel.close();
		fChannel = new RandomAccessFile("D:/javaio/DirList/02.txt", "rw").getChannel();
		fChannel.position(fChannel.size());
		//��һ�ζ�ȡ��д���λ�á�
		fChannel.write(ByteBuffer.wrap("asdf".getBytes()));
		fChannel.close();
		fChannel = new FileInputStream("D:/javaio/DirList/02.txt").getChannel();
		//����ͨ�������ֽ����������������Reader��Writer���ڲ��ݵ����ַ����ܲ���ͨ��
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		//ͨ���У�һ������һ�ο����ƶ������ݣ����Լ��趨ͨ��allocate
		fChannel.read(buffer);
		buffer.flip();
		//��תbuffer�е��ֽ�ָ��ʹ��ָ��0��buffer��ʼ��λ�ã����ڶ�����buffer����
		while(buffer.hasRemaining()) {
			System.out.println((char)buffer.get());
		}
		

	}

}
