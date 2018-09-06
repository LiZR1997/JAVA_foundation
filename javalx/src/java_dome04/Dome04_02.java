package java_dome04;

public class Dome04_02 {

	/**
	 * 
	 * java 字符串
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = new String("ABC");
		System.out.println(string.charAt(0));//取出相应位置的字符
//		System.out.println(string.length());
		char[] a = string.toCharArray();//将字符串存到数组中
//		System.out.println(a[2]);
		String string2 = new String("abc");
		
		//String中的相关比较
		System.out.println(string.equalsIgnoreCase(string2));//忽略大小写比较
		System.out.println(string.equals(string2));//不忽略大小写比较
		System.out.println(string.compareTo(string2));
		/*比较两个字符串的大小，诺a大于b，返回值大于0，相等则返回0，不相等返回值小于0
		  内部比较Comparable中的compareTo方法，可以重写该方法，来改变排序顺序
		*/
		String string3 = new String("qwertyuiop");
		String string4 = new String("Rtyu");
		System.out.println(string3.regionMatches(3, string4, 0, 4));
		/*
		 * string3.regionMatches(string3的偏移量, string4, string4的偏移量, 要比较的长度)；
		 * 在有偏移量的情况下比较两者是否相同，区分大小写
		 * */
		System.out.println(string3.startsWith("qwe"));
		/*
		 * startsWith（）比较两者开头是否相同，可以添加偏移量
		 * */
		System.out.println(string3.indexOf("iop")); 
		// 在字符串中进行索引，判断该字符串是否存在，并返回该位置，可以添加偏移量
		String string5 = string3.substring(0, 6);
		System.out.println(string5);
		//截取新的字符串，并返回
		System.out.println(string3.concat(string5));
		System.out.println(string3.replace("qwe", "111").toUpperCase());
		//合并  替换字符串 大小写转换

	}

}


























