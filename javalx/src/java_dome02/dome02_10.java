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
		hs.add("111111");//add()��������boolen���͵�����
		hs.add("222222");
		hs.add("333333");
		hs.add("444444");
		hs.add("333333");
		System.out.println(hs.size());//����set��Ԫ�صĸ���
		Iterator<String> iterator = hs.iterator();
		for( ;iterator.hasNext(); ) {
			System.out.println("  "+iterator.next());//��hash��������˳�򲻿�֪
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
			//ava �е�instanceof �����������������ʱָ�������Ƿ����ض����һ��ʵ����
			//instanceofͨ������һ������ֵ��ָ������������Ƿ�������ض�����������������һ��ʵ����
			Person person = (Person) obj;
			return this.name.equals(person.name) && this.age == person.age;
		}
		return false;
	}
	
}