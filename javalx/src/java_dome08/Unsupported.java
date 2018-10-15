package java_dome08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



public class Unsupported {

	/**
	 * @param args
	 */
	
	static void test(String msg , List<String> list) {
		Collection<String> c = list;
		Collection<String> subList = list.subList(1, 8);
		Collection<String> c2 = new ArrayList<String>(subList);
		try {
			c.retainAll(c2);			
		} catch (Exception e) {
			System.out.println("retainAll:" + e);
		}
		try {
			c.removeAll(c2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("removeAll:" + e);
		}
		try {
			c.clear();
		} catch (Exception e) {
			System.out.println("clear():" + e );
		}
		try {
			c.add("x");
		} catch (Exception e) {
			System.out.println("add():" + e);
		}
		try {
			c.addAll(c2);
		} catch (Exception e) {
			System.out.println("addAll():" + e);
		}
		try {
			c.remove("C");
		} catch (Exception e) {
			System.out.println("remove():" + e);
		}
		try {
			list.set(0, "X");			
		} catch (Exception e) {
			System.out.println("set():" + e);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list2 = new ArrayList<String>(10);
		for(int i = 0 ; i < 9 ; i++)
			list2.add("" + i);
		System.out.println("ArrayList()");
		test("", list2);
        //Arrays.asList(a)����һ��list ����һ���̶���С������  ��֧����Щ��С����ı�Ĳ���  
		//�κθı��С�Ĳ����������һ��UnsupportedOperationException
		List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
		System.out.println("Arrays.asList()");
		test("Arrays.asList()", list);
		System.out.println("ArrayList()");
		test("", Collections.unmodifiableList(new ArrayList<String>(list)));
		System.out.println("LinkList()");
		test("", new LinkedList<String>(list));
		List<String> list3 = new ArrayList<String>() ;
		System.out.println("Collections.addAll()");
		Collections.addAll( list3, "A B C D E F G H I J K L".split(" "));
		//���Խ�Arrays.asList()�Ľ����Ϊ�����������Collection��addAll()����������Collections.addAll()������������������ʹ�����з�������ͨ����
		test("" , list3);
	}

}
