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
		System.out.println("Collections.disjoint(c1, c2)判断c2中是否有c1包含的元素，诺有则返回fales" + Collections.disjoint(list, Collections.singletonList("ada")));//
		System.out.println("Collections.max()" + Collections.max(list));
		System.out.println("Collections.min()查询列表中最小项" + Collections.min(list));//


	}

}
