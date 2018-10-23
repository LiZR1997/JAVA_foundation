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
		//创建通道用于字节流的输入输出，但Reader与Writer由于操纵的是字符不能产生通道
		fChannel.write(ByteBuffer.wrap("qwertyuiop".getBytes()));
		//转换为字节流写入
		fChannel.close();
		fChannel = new RandomAccessFile("D:/javaio/DirList/02.txt", "rw").getChannel();
		fChannel.position(fChannel.size());
		//下一次读取或写入的位置。
		fChannel.write(ByteBuffer.wrap("asdf".getBytes()));
		fChannel.close();
		fChannel = new FileInputStream("D:/javaio/DirList/02.txt").getChannel();
		//创建通道用于字节流的输入输出，但Reader与Writer由于操纵的是字符不能产生通道
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		//通道中，一次所能一次快速移动的数据，由自己设定通过allocate
		fChannel.read(buffer);
		buffer.flip();
		//反转buffer中的字节指针使其指向0，buffer开始的位置，便于对整个buffer操作
		while(buffer.hasRemaining()) {
			System.out.println((char)buffer.get());
		}
		

	}

}
