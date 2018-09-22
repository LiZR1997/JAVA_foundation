package java_dome07;

import java_dome06.Generator;

public class GeneratorsTest {

	/**
	 * @param args
	 */
	public static int size = 10 ;
	@SuppressWarnings("unchecked")
	public static void test(Class<?> sClass) {
		for(Class<?> class1 : sClass.getClasses()) {
			System.out.print(class1.getSimpleName() + ":");
			try {
				Generator<?> g = (Generator<?>) class1.newInstance(); //ʵ��������
				for(int i = 0 ; i < size ; i++)
					System.out.print(g.next() + " ");
				System.out.println("");
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //ʵ��������
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(CountingGenerator.class);
	}

}
