package java_dome09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortcut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("D:/javaio/DirList/2.txt")));
			PrintWriter out = new PrintWriter("D:/javaio/DirList/t.txt");
			//ʹ��PrintWriterʱ����ʹ��������
			int lineCount = 1 ;
			//�к�
			String s ;
			//�洢��Ҫ�����ļ���ÿһ��
			while((s = in.readLine()) != null) {
				out.println(lineCount++ + ";" + s);
				//�����ݰ���д���л���ļ�
			}
			out.close();
			//�ر��ֽ���
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
