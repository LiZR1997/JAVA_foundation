package java_dome02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dome02_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<UserInfo> list = new ArrayList<UserInfo>();
		list.add(new UserInfo(1,21,"name1"));
		list.add(new UserInfo(2,27,"name1"));
		list.add(new UserInfo(3,15,"name1"));
		list.add(new UserInfo(5,24,"name1"));
		list.add(new UserInfo(4,24,"name1"));
		//对该类排序
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("00000000000000");
		Collections.sort(list, Collections.reverseOrder());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		int high = 10, mind , low = 0;
		mind = (high + low) >>> 1;
		System.out.println(mind);


	}

}

class UserInfo implements Comparable<UserInfo> {
	private int userid;
	private int age;
	private String name;
	
	public UserInfo(int userid, int age , String name) {
		this.userid = userid;
		this.age = age;
		this.name = name;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.userid+","+this.age+","+this.name;
	}

	@Override
	public int compareTo(UserInfo o) {
		// TODO Auto-generated method stub
		if(this.age - o.age == 0)//首先比较年龄，若年龄相投则比较学号
			return this.userid - o.userid;
		else
			return this.age - o.age;
		//①当返回值的是自身减去参数（即this - o）是正序排序
		//②当返回值的是参数减去自身（即o - this ）则是逆序排序
	}
	
	

}