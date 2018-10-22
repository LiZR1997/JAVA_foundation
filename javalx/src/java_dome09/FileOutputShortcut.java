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
			//使用PrintWriter时不必使用修饰器
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
