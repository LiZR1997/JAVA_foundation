package java_dome06;

import java.util.ArrayList;
import java.util.List;

public class Dome06_09 {

	/**
	 * @param args
	 */
	
	// ��������൱��Arrays.asList������
	public static <T> List<T> makeList(T... ages) {//�ɱ䳤�����б��൱������
		List<T> result = new ArrayList<T>();
		for(T rT : ages)
			result.add(rT);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = makeList("A,S,D,F,G,H,J,K,L".split(","));
		for(String string : strings)
			System.out.print(string +" ");
	}

}
