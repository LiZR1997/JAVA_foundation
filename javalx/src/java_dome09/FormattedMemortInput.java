package java_dome09;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemortInput {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream inputStream = null;
		try {
			inputStream = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("D:/javaio/DirList/2.txt").getBytes()));
//			while(true)
			while(inputStream.available() != 0)
				System.out.println((char)inputStream.readByte());
			//readByte()����ȡ�ַ��κ��ַ����Ϸ���������������ַ��Ƿ����
			//��������available()�����ʣ������ַ�
				
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			inputStream.close();
			System.out.println("��ֹ");
		}

	}

}
