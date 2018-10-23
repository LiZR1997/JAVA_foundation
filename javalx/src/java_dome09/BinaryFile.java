package java_dome09;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFile {
	
	//�÷���������File����
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
	
	//�÷�������Ϊ�ļ��ľ��Ի���Ե�ַ
	public static byte[] read(String bFile) throws IOException {
		return read(new File(bFile).getAbsoluteFile());
	}

}
