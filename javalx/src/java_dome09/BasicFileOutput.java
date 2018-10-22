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
			/*待写入的文件       
			 *    FileWriter（）以写的方式打开文件    
			 *    BufferedWriter() 为带有默认缓冲的字符输出输入流    
			 *    缓冲区的出现是为了提高流的操作效率而出现的
             *    所以在创建缓冲区之前，必须要先有流对象，需要所以FileWriter（）创建流对象
			 *    PrintWriter是java中很常见的一个类，该类可用来创建一个文件并向文本文件写入数据，若文件存在则写入，如果文件不存在则创建
			 *    */
			int lineCount = 1 ;
			//行号
			String s ;
			//存储所要读的文件的每一行
			while((s = in.readLine()) != null) {
				out.println(lineCount++ + ";" + s);
				//将数据按行写入代谢的文件
			}
			out.close();
			//关闭字节流
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
