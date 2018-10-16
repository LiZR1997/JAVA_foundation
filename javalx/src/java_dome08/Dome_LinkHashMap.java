package java_dome08;

import java.util.LinkedHashMap;

public class Dome_LinkHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(16,0.75f,true);
		//Ê¹ÓÃlruËã·¨
		linkedHashMap.put(11, "11");
		linkedHashMap.put(12, "12");
		linkedHashMap.put(13, "13");
		linkedHashMap.put(14, "14");
		System.out.println(linkedHashMap);
		for(int i = 11 ; i <= 12 ; i++)
			linkedHashMap.get(i);
		System.out.println(linkedHashMap);

	}

}
