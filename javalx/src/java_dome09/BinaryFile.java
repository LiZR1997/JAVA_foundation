package java_dome09;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFile {
	
	//该方法必须获得File对象
	public static byte[] read(File bFile) throws IOException {
		
		BufferedInputStream bufferedInputStream = new 
				BufferedInputStream(new FileInputStream(bFile));
		try {
			byte[] data = new byte[bufferedInputStream.available()];
			bufferedInputStream.read();
			return data;		
		} finally {
			bufferedInputStream.close();
		}
	}
	
	//该方法参数为文件的绝对或相对地址
	public static byte[] read(String bFile) throws IOException {
		return read(new File(bFile).getAbsoluteFile());
	}

}
