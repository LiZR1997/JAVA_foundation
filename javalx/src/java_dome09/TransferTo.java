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
                                ���ֽڴӴ�ͨ�����ļ����䵽�����Ŀ�д���ֽ�ͨ���� 
                                ��ͼ��ȡ�Ӵ�ͨ�����ļ��и��� position ����ʼ�� count ���ֽڣ�������д��Ŀ��ͨ�����˷����ĵ��ò�һ����������������ֽڣ���
                                ����ȡ����ͨ�������ʺ�״̬�������ͨ�����ļ��Ӹ����� position ����ʼ���������ֽ���С�� count ���ֽڣ��������Ŀ��ͨ���Ƿ�
                                �����Ĳ���������������е����ɿռ����� count ���ֽڣ�����������ֽ���ҪС��������ֽ����� 
                                �˷������޸Ĵ�ͨ����λ�á����������λ�ô��ڸ��ļ��ĵ�ǰ��С���򲻴����κ��ֽڡ����Ŀ��ͨ�����и�λ�ã���Ӹ�λ�ÿ�ʼд����ֽڣ�Ȼ�󽫸�λ������д����ֽ����� 
                                ��Ӵ�ͨ����ȡ��������д��Ŀ��ͨ���ļ�ѭ�������ȣ��˷������ܸ�Ч�öࡣ�ܶ����ϵͳ�ɽ��ֽ�ֱ�Ӵ��ļ�ϵͳ���洫�䵽Ŀ��ͨ����������ʵ�ʸ��Ƹ��ֽڡ�    
                               ������
             position - �ļ��е�λ�ã��Ӵ�λ�ÿ�ʼ���䣻����Ϊ�Ǹ���
             count - Ҫ���������ֽ���������Ϊ�Ǹ���
             target - Ŀ��ͨ�� 
                                      ���أ�
                          ʵ���Ѵ�����ֽ���������Ϊ�� 

		 * 
		 * */
		

	}

}
