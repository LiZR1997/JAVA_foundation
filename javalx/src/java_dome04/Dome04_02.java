package java_dome04;

public class Dome04_02 {

	/**
	 * 
	 * java �ַ���
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = new String("ABC");
		System.out.println(string.charAt(0));//ȡ����Ӧλ�õ��ַ�
//		System.out.println(string.length());
		char[] a = string.toCharArray();//���ַ����浽������
//		System.out.println(a[2]);
		String string2 = new String("abc");
		
		//String�е���رȽ�
		System.out.println(string.equalsIgnoreCase(string2));//���Դ�Сд�Ƚ�
		System.out.println(string.equals(string2));//�����Դ�Сд�Ƚ�
		System.out.println(string.compareTo(string2));
		/*�Ƚ������ַ����Ĵ�С��ŵa����b������ֵ����0������򷵻�0������ȷ���ֵС��0
		  �ڲ��Ƚ�Comparable�е�compareTo������������д�÷��������ı�����˳��
		*/
		String string3 = new String("qwertyuiop");
		String string4 = new String("Rtyu");
		System.out.println(string3.regionMatches(3, string4, 0, 4));
		/*
		 * string3.regionMatches(string3��ƫ����, string4, string4��ƫ����, Ҫ�Ƚϵĳ���)��
		 * ����ƫ����������±Ƚ������Ƿ���ͬ�����ִ�Сд
		 * */
		System.out.println(string3.startsWith("qwe"));
		/*
		 * startsWith�����Ƚ����߿�ͷ�Ƿ���ͬ���������ƫ����
		 * */
		System.out.println(string3.indexOf("iop")); 
		// ���ַ����н����������жϸ��ַ����Ƿ���ڣ������ظ�λ�ã��������ƫ����
		String string5 = string3.substring(0, 6);
		System.out.println(string5);
		//��ȡ�µ��ַ�����������
		System.out.println(string3.concat(string5));
		System.out.println(string3.replace("qwe", "111").toUpperCase());
		//�ϲ�  �滻�ַ��� ��Сдת��

	}

}


























