package java_dome09;

import java.io.File;

public class MakeDirectories {
	
	private static void usage() {
		System.err.println("");
		System.exit(1);
	}
	
	private static void fileData(File file) {
		System.out.println("canRead����" + file.canRead());
		//�ж��ļ��Ƿ�ɶ�
		System.out.println("canWrite����" + file.canWrite());
		//�ж��ļ��Ƿ��д
		System.out.println("length����" + file.length());
		//�÷����������Ƿ����ļ��洢ʱռ�õ��ֽ���������ֵ��õ����ļ���ʵ�ʴ�С���������ļ��ڴ洢ʱռ�õĿռ�����
		System.out.println("getName����" + file.getName() );
		//�÷����������ǻ�õ�ǰ�ļ����ļ��е����ơ�����c�� est/1.t���򷵻�1.t
		System.out.println("getParent����" + file.getParent() );
		//�÷����������ǻ�õ�ǰ·���еĸ�·��������c�� est1.t�򷵻�c�� est
		System.out.println("exists����" + file.exists() );
		//���÷������������жϵ�ǰ�ļ����ļ����Ƿ����
		System.out.println("getAbsolutePath����" + file.getAbsolutePath() );
		//�÷����������ǻ�õ�ǰ�ļ����ļ��еľ���·��������c�� est1.t�򷵻�c�� est1.t.
		if(file.isDirectory())
			System.out.println("It's Directory");
		else if(file.isFile()) {
			System.out.println("It's File");
		}
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("D:/javaio/DirList/2.txt");
		File path2 = new File("D:/javaio/DirList2/2.txt");
		System.out.println(path2.renameTo(path));
		//A.renameTo(B); A����Ϊ���ڵ�Ŀ¼��B����Ϊ�����ڵ�Ŀ¼����AĿ¼�µ��ļ��ƶ���B
		
		fileData(path);

	}

}
