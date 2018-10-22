package java_dome09;

import java.io.File;

public class MakeDirectories {
	
	private static void usage() {
		System.err.println("");
		System.exit(1);
	}
	
	private static void fileData(File file) {
		System.out.println("canRead方法" + file.canRead());
		//判断文件是否可读
		System.out.println("canWrite方法" + file.canWrite());
		//判断文件是否可写
		System.out.println("length方法" + file.length());
		//该方法的作用是返回文件存储时占用的字节数。该数值获得的是文件的实际大小，而不是文件在存储时占用的空间数。
		System.out.println("getName方法" + file.getName() );
		//该方法的作用是获得当前文件或文件夹的名称。例如c： est/1.t，则返回1.t
		System.out.println("getParent方法" + file.getParent() );
		//该方法的作用是获得当前路径中的父路径。例如c： est1.t则返回c： est
		System.out.println("exists（）" + file.exists() );
		//　该方法的作用是判断当前文件或文件夹是否存在
		System.out.println("getAbsolutePath方法" + file.getAbsolutePath() );
		//该方法的作用是获得当前文件或文件夹的绝对路径。例如c： est1.t则返回c： est1.t.
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
		//A.renameTo(B); A必须为存在的目录，B必须为不存在的目录，将A目录下的文件移动到B
		
		fileData(path);

	}

}
