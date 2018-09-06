package java_dome02;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class dome02_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<people> treeSet = new TreeSet<people>(new caozuo());
		treeSet.add(new people("li", 22, "11111", "1111"));
		treeSet.add(new people("li", 23, "11111", "1111"));
		treeSet.add(new people("jiang", 24, "11111", "1111"));
		treeSet.add(new people("chen", 22, "111111", "1111"));
		Iterator<people> iterator = treeSet.iterator();
		for(;iterator.hasNext();)
		System.out.println(iterator.next().toString());
		
	}

}

class people {
	private String name;
	private int age;
	private String email;
	private String mima;
	

	public people(String name, int age, String email, String mima) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.mima = mima;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMima() {
		return mima;
	}

	public void setMima(String mima) {
		this.mima = mima;
	}
	
	public String toString() {
		return "姓名： "+name+" 年龄： "+age+" 密码 "+mima+" 电子邮件 "+email;
	}
	
}

class caozuo implements Comparator<people> {

	@Override
	public int compare(people o1, people o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() != o2.getAge())
			return o1.getAge() - o2.getAge();
		else {
			if(o1.getName().contains(o2.getName()))
				return 0;
			else return o1.getName().compareTo(o2.getName());
		}		
	}
	
//	public String toString(people p) {
//		return "姓名： "+p.getName()+" 年龄： "+p.getAge()+" 密码 "+p.getMima()+" 电子邮件 "+p.getEmail();
//	}
}