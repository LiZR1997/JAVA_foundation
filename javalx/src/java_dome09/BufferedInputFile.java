package java_dome09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {

	/**
	 * @param args
	 */
	public static String read(String filename) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(filename));//提高读写速度对整个文件进行缓冲BufferedReader（）方法
		String string ;
		StringBuffer sb = new StringBuffer();
		while((string = in.readLine()) != null)
		{
			sb.append(string + "\n");
		}
		in.close();
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print(read("D:/javaio/DirList/2.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
