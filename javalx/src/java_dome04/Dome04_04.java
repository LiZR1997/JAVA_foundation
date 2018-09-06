package java_dome04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dome04_04 {

	public static String string = "<table><tr><td>hello world</td><td>hello regex</td></tr></table>";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("贪婪模式");//匹配所有，在进行匹配时，吞并所有字符串，从右侧吐出不服的字符串，直至满足
		
		Pattern pattern = Pattern.compile("<td>.*</td>");//编译正则表达式到模式对象
		
		Matcher matcher = pattern.matcher(string);//得到匹配器
		
		while(matcher.find())//通过find方法查找匹配，找到就返回true，否则返回false
			System.out.println(matcher.group() + "  " + matcher.start() + " " + matcher.end());
	
	    System.out.println("勉强模式");//只匹配最近的一次，总从左侧吞入，满足停止吞入
	    
		Pattern pattern1 = Pattern.compile("<td>.*?</td>");//编译正则表达式到模式对象
		
		Matcher matcher1 = pattern1.matcher(string);//得到匹配器
		
		while(matcher1.find())//通过find方法查找匹配，找到就返回true，否则返回false
			System.out.println(matcher1.group() + "  " + matcher1.start() + " " + matcher1.end());
	    
		//
		String string2 = "aaaa111aa111111111111111aaaaaaaaaaaaaa1a1a1aaaaaaa";
//		Pattern pattern2 = Pattern.compile("a*"); // *在进行匹配时能匹配0次或多次
//		Pattern pattern2 = Pattern.compile("a+"); // +能匹配一次或多次
//		Pattern pattern2 = Pattern.compile("a?"); // ？ 匹配0次或一次
//		Pattern pattern2 = Pattern.compile("a*a"); 
//	    Matcher matcher2 = pattern2.matcher(string2);
//		while(matcher2.find())
//			System.out.println(matcher2.group()+" "+matcher2.start()+" "+matcher2.end());
//		Pattern pattern2 = Pattern.compile("\\d+");

		
//		Pattern pattern2 = Pattern.compile("[0-9]*[0-9]");
//		for(String s : pattern2.split(string2)) //切片
//			System.out.print(s + "/");
	
		
	}
}
