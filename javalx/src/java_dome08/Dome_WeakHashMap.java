package java_dome08;

import java.util.WeakHashMap;

public class Dome_WeakHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<Integer, String>();
		weakHashMap.put(1, "111111");
		weakHashMap.put(2, "222222");
		weakHashMap.put(3, "333333");
		weakHashMap.put(4, "444444");
		String string = null;
		System.out.println(weakHashMap.entrySet());
//		System.out.println("tom".equals(string));
//		System.out.println(string.equals("tom"));
//		weakHashMap没有clone函数，无法克隆字迹
		}

}
