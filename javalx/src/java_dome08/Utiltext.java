package java_dome08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utiltext {
	static List<String> list = new ArrayList<String>(Arrays.asList("asd ada dwdeg gegeesg ggeg gregfl lelfw efw".split(" ")));

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(list);
		System.out.println("Collections.disjoint(c1, c2)�ж�c2���Ƿ���c1������Ԫ�أ�ŵ���򷵻�fales" + Collections.disjoint(list, Collections.singletonList("ada")));//
		System.out.println("Collections.max()" + Collections.max(list));
		System.out.println("Collections.min()��ѯ�б�����С��" + Collections.min(list));//


	}

}
