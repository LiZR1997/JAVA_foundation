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

		System.out.println("̰��ģʽ");//ƥ�����У��ڽ���ƥ��ʱ���̲������ַ��������Ҳ��³��������ַ�����ֱ������
		
		Pattern pattern = Pattern.compile("<td>.*</td>");//����������ʽ��ģʽ����
		
		Matcher matcher = pattern.matcher(string);//�õ�ƥ����
		
		while(matcher.find())//ͨ��find��������ƥ�䣬�ҵ��ͷ���true�����򷵻�false
			System.out.println(matcher.group() + "  " + matcher.start() + " " + matcher.end());
	
	    System.out.println("��ǿģʽ");//ֻƥ�������һ�Σ��ܴ�������룬����ֹͣ����
	    
		Pattern pattern1 = Pattern.compile("<td>.*?</td>");//����������ʽ��ģʽ����
		
		Matcher matcher1 = pattern1.matcher(string);//�õ�ƥ����
		
		while(matcher1.find())//ͨ��find��������ƥ�䣬�ҵ��ͷ���true�����򷵻�false
			System.out.println(matcher1.group() + "  " + matcher1.start() + " " + matcher1.end());
	    
		//
		String string2 = "aaaa111aa111111111111111aaaaaaaaaaaaaa1a1a1aaaaaaa";
//		Pattern pattern2 = Pattern.compile("a*"); // *�ڽ���ƥ��ʱ��ƥ��0�λ���
//		Pattern pattern2 = Pattern.compile("a+"); // +��ƥ��һ�λ���
//		Pattern pattern2 = Pattern.compile("a?"); // �� ƥ��0�λ�һ��
//		Pattern pattern2 = Pattern.compile("a*a"); 
//	    Matcher matcher2 = pattern2.matcher(string2);
//		while(matcher2.find())
//			System.out.println(matcher2.group()+" "+matcher2.start()+" "+matcher2.end());
//		Pattern pattern2 = Pattern.compile("\\d+");

		
//		Pattern pattern2 = Pattern.compile("[0-9]*[0-9]");
//		for(String s : pattern2.split(string2)) //��Ƭ
//			System.out.print(s + "/");
	
		
	}
}
