package java_dome06;

import java.lang.reflect.Array;

public class Dome06_06<T> {

	/**
	 * @param args
	 */
	
	private T[] age;
	@SuppressWarnings("unchecked")
	/*
	 * ע�⣬���Ʊ���������������Ϣ
	 * */
	public Dome06_06(Class<T> t , int size) {
		// TODO Auto-generated constructor stub
		age = (T[])Array.newInstance(t, size); //��̬�������飬ʹ��Ӳ����лָ�
	}
	
	public void put(int index , T item) {
		age[index] = item;
	}
	
	public T giti(int index){
		return (T)age[index];
	}
	
	public T[] git(){
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dome06_06<Integer> dome06_06 = new Dome06_06<Integer>(Integer.class, 10);
		for(int i = 0 ; i<=9 ; i++)
			dome06_06.put(i, i);
//		Integer [] integers = dome06_06.git();
//		System.out.println(integers[2]);
		for(Integer integer : dome06_06.git())
			System.out.println(integer);
	}

}
