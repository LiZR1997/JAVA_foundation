package java_dome09;

import java.io.*;

public class BasicFileOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("D:/javaio/DirList/2.txt")));
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("D:/javaio/DirList/t.txt")));
			/*��д����ļ�       
			 *    FileWriter������д�ķ�ʽ���ļ�    
			 *    BufferedWriter() Ϊ����Ĭ�ϻ�����ַ����������    
			 *    �������ĳ�����Ϊ��������Ĳ���Ч�ʶ����ֵ�
             *    �����ڴ���������֮ǰ������Ҫ������������Ҫ����FileWriter��������������
			 *    PrintWriter��java�кܳ�����һ���࣬�������������һ���ļ������ı��ļ�д�����ݣ����ļ�������д�룬����ļ��������򴴽�
			 *    */
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
