package java_dome04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dome04_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Matcher matcher = Pattern.compile("\\d+").matcher("asdasd11g rg  rg werwt     , vrvere.vre.vww.r.");
		Matcher matcher = Pattern.compile("\\d+").matcher("15qww5");
		for(;matcher.find();)
		System.out.print(matcher.group() + "/");
		for(int i = 0 ;matcher.find(i) ; i++)//matcher 可以接受参数作为寻找字符串的起始点
			System.out.print(matcher.group() + "/");
		
	}

}
