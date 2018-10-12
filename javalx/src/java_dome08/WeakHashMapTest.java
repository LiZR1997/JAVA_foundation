package java_dome08;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testWeakHashMapAPIs();
		testHashMapAPIs();

	}
	
	private static void testWeakHashMapAPIs() {
		String w1 = new String("one");
		String w2 = new String("two");
		String w3 = new String("three");
		Map wMap = new WeakHashMap();
		wMap.put(w1,"w1");
		wMap.put(w2,"w2");
		wMap.put(w3,"w3");
		System.out.println(wMap);
		System.out.println(wMap.containsKey("two"));
		System.out.println(wMap.containsKey("111"));
		w1 = null;
		// ��w1����null��
		// ����ζ�š�������w1��û�б������������ã�����gcʱ�����WeakHashMap���롰w1����Ӧ�ļ�ֵ��
		System.gc();
		System.out.println(wMap);
	}
	
	private static void testHashMapAPIs() {
		String w1 = new String("one");
		String w2 = new String("two");
		String w3 = new String("three");
		HashMap wMap = new HashMap();
		wMap.put(w1, "w1");
		wMap.put(w2, "w2");
		wMap.put(w3, "w3");
		System.out.println(wMap);
		System.out.println(wMap.containsKey("two"));
		System.out.println(wMap.containsKey("111"));
		w1 = null;
		//��w1����Ϊnull
		//��hashmap�е�����Ϊǿ���ã���ǿ�����������ڶ�w1�����ã������gc���Ὣ������գ���Ҫͬʱ��hashmap�е�Ԫ��ɾ��
		System.gc();
		wMap.remove(new String("one"));
		System.out.println(wMap + "hashmap�Ĵ�С" + wMap.size());
	}

}
