package java_dome04;

import java.util.Arrays;

public class Dome04_03 {

	public static String string = "individual characters of the sequence, for comparing strings, for"+
    " searching strings, for extracting substrings, and for creating a"+
    " copy of a string with all characters translated to uppercase or to"+
    " lowercase. Case mapping is based on the Unicode Standard version"+
    " specified by the";
	/**
	 * @category 正则表达式
	 * @param args
	 */
	public static void split(String zz)
	{
		System.out.println(Arrays.toString(string.split(zz)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		split(" ");
		split("\\W+");
//		split("for");
//		split("\\W+");
		System.out.println(string.replaceFirst("f\\w+", "替换"));
		//查找替换第一个符合的部分
		System.out.println(string.replaceAll("f\\w+", "替换所有部分"));
		//替换所有符合的部分
	}

}
