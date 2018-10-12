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
		// 将w1设置null。
		// 这意味着“弱键”w1再没有被其它对象引用，调用gc时会回收WeakHashMap中与“w1”对应的键值对
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
		//将w1设置为null
		//但hashmap中的引用为强引用，“强键”，还存在对w1的引用，则调用gc不会将对象回收，需要同时将hashmap中的元素删除
		System.gc();
		wMap.remove(new String("one"));
		System.out.println(wMap + "hashmap的大小" + wMap.size());
	}

}
