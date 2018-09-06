package java_dome02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class dome02_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<String>();
		hs.add("111111");//add()方法返回boolen类型的数据
		hs.add("222222");
		hs.add("333333");
		hs.add("444444");
		hs.add("333333");
		System.out.println(hs.size());//返回set中元素的个数
		Iterator<String> iterator = hs.iterator();
		for( ;iterator.hasNext(); ) {
			System.out.println("  "+iterator.next());//按hash策略排序顺序不可知
		}
		
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("a1", 11111));
		hSet.add(new Person("a2", 11111));
		hSet.add(new Person("a3", 33333));
		Iterator iterator2 = hSet.iterator();
		for(;iterator2.hasNext();)
		{
			Object next = iterator2.next();
			System.out.println(next);
		}

	}

}

class Person {
	private String name;
	
	private int age;
	

	public Person(String name, int age) {
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
	
	public int hashCode() {
		System.out.println("hashCode:" + this.name);
		return this.name.hashCode() + age * 37;
	}
	
	public boolean equals(Object obj) {
		System.out.println(this + "---equals" + obj);
		if (obj instanceof Person) {
			//ava 中的instanceof 运算符是用来在运行时指出对象是否是特定类的一个实例。
			//instanceof通过返回一个布尔值来指出，这个对象是否是这个特定类或者是它的子类的一个实例。
			Person person = (Person) obj;
			return this.name.equals(person.name) && this.age == person.age;
		}
		return false;
	}
	
}