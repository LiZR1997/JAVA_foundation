package java_dome09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class TransferTo {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileChannel in = new FileInputStream("D:/javaio/DirList/02.txt").getChannel(),
				out = new FileOutputStream("D:/javaio/DirList/15.txt").getChannel();
		in.transferTo(0, in.size(), out);
		/*
		 * 
		 * public abstract long transferTo(long position,
                                long count,
                                WritableByteChannel target)
                         throws IOException
                                将字节从此通道的文件传输到给定的可写入字节通道。 
                                试图读取从此通道的文件中给定 position 处开始的 count 个字节，并将其写入目标通道。此方法的调用不一定传输所有请求的字节；是
                                否传输取决于通道的性质和状态。如果此通道的文件从给定的 position 处开始所包含的字节数小于 count 个字节，或者如果目标通道是非
                                阻塞的并且其输出缓冲区中的自由空间少于 count 个字节，则所传输的字节数要小于请求的字节数。 
                                此方法不修改此通道的位置。如果给定的位置大于该文件的当前大小，则不传输任何字节。如果目标通道中有该位置，则从该位置开始写入各字节，然后将该位置增加写入的字节数。 
                                与从此通道读取并将内容写入目标通道的简单循环语句相比，此方法可能高效得多。很多操作系统可将字节直接从文件系统缓存传输到目标通道，而无需实际复制各字节。    
                               参数：
             position - 文件中的位置，从此位置开始传输；必须为非负数
             count - 要传输的最大字节数；必须为非负数
             target - 目标通道 
                                      返回：
                          实际已传输的字节数，可能为零 

		 * 
		 * */
		

	}

}
