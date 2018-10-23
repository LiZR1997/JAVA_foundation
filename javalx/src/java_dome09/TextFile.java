package java_dome09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class TextFile extends ArrayList<String> {
	public static String read(String filname) {
		StringBuffer stringBuffer = new StringBuffer();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filname
					).getAbsoluteFile()));
			try {
				String string;
				while((string = bufferedReader.readLine()) != null) {
					stringBuffer.append(string);
					stringBuffer.append("\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				bufferedReader.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringBuffer.toString();
	}
	
	public static void write( String fileName , String text) {
		try {
			PrintWriter printWriter = new PrintWriter(new File(fileName).getAbsoluteFile());
			try {
				printWriter.print(text);
			} finally {
				printWriter.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public TextFile(String fileName , String splitter) {
		super(Arrays.asList(read(fileName).split(splitter)));
		//将元素写入父类ArrayList()的构造方法,按行切片
		if(get(0).equals(""))
			remove(0);
	}
	
	public TextFile(String fileName) {
		this(fileName,"\n");
	}
	
	public void write(String fileName) {
		try {
			PrintWriter printWriter = new PrintWriter(new File(fileName).getAbsoluteFile());
			try {
				for(String string : this)
				//调用引用的对象 this 
			    //例如下面的例子中调用 TextFile 中的 ArrayList对象
				printWriter.print(string);
			} finally {
				printWriter.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String file = read("D:/javaio/DirList/15.txt");
		write("D:/javaio/DirList/02.txt", file + "16");
		TextFile textFile = new TextFile("D:/javaio/DirList/15.txt");
		textFile.write("D:/javaio/DirList/02.txt");//
	}
	

}
