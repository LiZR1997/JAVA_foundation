package java_dome09;

import java.io.IOException;
import java.io.StringReader;

public class MenoryInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StringReader in = new StringReader(BufferedInputFile.read("D:/javaio/DirList/2.txt"));//��ȡ�ַ������ֽ���
			int c;
			while((c = in.read()) != -1)// �ӻ����а��ֽڶ�ȡ
				System.out.println((char)c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
