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
	    	  System.out.println("��"+i+"��"+stringBuffer);
	    	}
	    /*
	     * cat���滻Ϊdog,���ҽ����ƥ�䵽֮ǰ���Ӵ�����ӵ�stringBuffer������
	     * ������Matcher����,������ı�ԭ�ַ�������ƥ��Ԫ�غ���������
	     * */
	    matcher.appendTail(stringBuffer);
	    System.out.println("appendTail()�����ƥ�䵽������Ӵ���ӵ�sb������"+stringBuffer);
	    for(;matcher1.find();)
	    	System.out.println(matcher1.replaceAll("dag"));
	    /*
	     * replaceAll() һ���滻����,������String
	     * */
	    	System.out.println(string);
	}

}
