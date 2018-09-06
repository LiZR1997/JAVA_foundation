package java_dome04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dome04_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "11111cat111cat1111cat11111catcat111";
		Matcher matcher = Pattern.compile("cat").matcher(string);
		Matcher matcher1 = Pattern.compile("cat").matcher(string);
	    StringBuffer stringBuffer = new StringBuffer();
	    for(int i = 1 ; matcher.find() ; i++ ) 
	    	{
	    	  matcher.appendReplacement(stringBuffer, "dag");
	    	  System.out.println("第"+i+"次"+stringBuffer);
	    	}
	    /*
	     * cat被替换为dog,并且将最后匹配到之前的子串都添加到stringBuffer对象中
	     * 创建了Matcher对象,并不会改变原字符串，无匹配元素后立刻跳出
	     * */
	    matcher.appendTail(stringBuffer);
	    System.out.println("appendTail()将最后匹配到后面的子串添加到sb对象中"+stringBuffer);
	    for(;matcher1.find();)
	    	System.out.println(matcher1.replaceAll("dag"));
	    /*
	     * replaceAll() 一次替换所有,并返回String
	     * */
	    	System.out.println(string);
	}

}
