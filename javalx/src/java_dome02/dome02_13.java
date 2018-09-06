package java_dome02;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.text.html.parser.Entity;



public class dome02_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, darling> hashMap =  new HashMap<String, darling>();
		hashMap.put("02", new darling("02", 18));
		hashMap.put("广", new darling("15", 17));
		hashMap.put("莓", new darling("16", 17));
		System.out.println(hashMap.get("02"));
		
		Iterator<Entry<String, darling>> iterator = hashMap.entrySet().iterator();
		for(;iterator.hasNext();) {
		    Map.Entry<String, darling> entry= iterator.next();
		    System.out.println("姓名 "+entry.getKey() + "代号" +entry.getValue().getName()+"年龄"+entry.getValue().getAge()); 
		}
		Iterator<String> iterator2 = hashMap.keySet().iterator();
		for(;iterator2.hasNext();) {
			System.out.println(hashMap.get(iterator2.next()) + " //");
		}
		Map<String, darling> treeMap = new TreeMap<String, darling>(new inThe());
		treeMap.put("02", new darling("02", 18));
		treeMap.put("广", new darling("15", 17));
		treeMap.put("莓", new darling("16", 17));
		Iterator<Entry<String,darling>> iterator3 = treeMap.entrySet().iterator();
		for(;iterator3.hasNext();) {
			Map.Entry<String , darling> e = iterator3.next();
			System.out.println("姓名 "+e.getKey() + "代号" +e.getValue().getName()+"年龄"+e.getValue().getAge());
		}

	}

}

 class darling {
	 private String name ;
	 private int age ;
	 
	public darling(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "姓名 "+ this.name+" 年龄 "+this.age;
	}
	
 }
 
 class inThe implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.contains(o2))
			return 0;
		else 
			return -o1.compareTo(o2);
	}
	 
 }
 
 
 
 
 