package java_dome06;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class dog {
	public void get1() {
		System.out.println("dog get1");
	}
	public void get2() {
		System.out.println("dog get2");
	}
}

class mime {
	public void get1() {
		System.out.println("mime get1");
	}
	public void get2() {
		System.out.println("mime get2");
	}
}

class Basic1 {
	public static void perfrom(Object object) {
		Class<?> srk = object.getClass();
		try {
			Method get1 = srk.getMethod("get1");
			get1.invoke(object);
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Method get2 = srk.getMethod("get2");//////////////////
			get2.invoke(object);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Dome06_12 {

	/**
	 * java¡¡·´Éä»úÖÆ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basic1.perfrom(new mime());
		Basic1.perfrom(new dog());

	}

}
