package java_dome02;

import java.util.Iterator;
import java.util.TreeSet;

public class dome02_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tSet = new TreeSet<String>();//TreeSet实现元素的有序排列
		tSet.add("ccc");
		tSet.add("aaa");
		tSet.add("bbb");
		tSet.add("bbb");
		System.out.println(tSet);
		
		TreeSet tPersons = new TreeSet();
		tPersons.add(new Person1("li1",19,"2000"));
		tPersons.add(new Person1("li4",16,"2000"));
		tPersons.add(new Person1("li2",11,"2002"));
		tPersons.add(new Person1("li4",22,"2002"));
		tPersons.add(new Person1("li3",22,"2001"));
		Iterator<Person1> iterator = tPersons.iterator();
		for(;iterator.hasNext();)
		System.out.println(iterator.next().toString());

	}

}

class Person1 implements Comparable {
	private String name;
	private int age;
	private String gender;
 
	public Person1(String name, int age, String gender) {
 
		this.name = name;
		this.age = age;
		this.gender = gender;
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
 
	public String getGender() {
		return gender;
	}
 
	public void setGender(String gender) {
		this.gender = gender;
	}
 
 
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender
				+ "]";
	}
 
	@Override
	public int compareTo(Object obj) {
		
		Person1 p = (Person1) obj;
//		System.out.println(this+" compareTo:"+p);
		if (this.age > p.age) {
			return 1;
		}
		if (this.age < p.age) {
			return -1;
		}
		return this.name.compareTo(p.name);
	}

 
}
