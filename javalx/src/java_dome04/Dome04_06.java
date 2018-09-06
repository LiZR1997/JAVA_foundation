package java_dome04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dome04_06 {

	/**
	 * @category java 正则
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "https://www.bilibili.com";
		Matcher matcher = Pattern.compile("(\\w+)(\\W+)(\\w*.)(\\w+)(.\\w+)").matcher(string);
		for(;matcher.find();)
		{
			System.out.println(matcher.group());
			System.out.println(matcher.group(0));
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println(matcher.group(3));
			System.out.println(matcher.group(4));
			System.out.println(matcher.group(5));
		}
		/*   java正则表达式中的组   
		 *   获取数据后能更容易的对数据处理（直接）
		 * 
		 * */
		matcher = Pattern.compile("http").matcher(string);
		System.out.println("lookingAt():" + matcher.lookingAt());
		System.out.println("matcher():" + matcher.matches());
		/*
		 * lookingAt() 只需要匹配开头
		 * matcher() 则需要整句匹配
		 * */
	}

}
