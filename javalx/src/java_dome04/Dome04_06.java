package java_dome04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dome04_06 {

	/**
	 * @category java ����
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
		/*   java������ʽ�е���   
		 *   ��ȡ���ݺ��ܸ����׵Ķ����ݴ���ֱ�ӣ�
		 * 
		 * */
		matcher = Pattern.compile("http").matcher(string);
		System.out.println("lookingAt():" + matcher.lookingAt());
		System.out.println("matcher():" + matcher.matches());
		/*
		 * lookingAt() ֻ��Ҫƥ�俪ͷ
		 * matcher() ����Ҫ����ƥ��
		 * */
	}

}
