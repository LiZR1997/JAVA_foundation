package java_dome05;

public class Dome05_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.class.getClassLoader());
		System.out.println(System.class.getClassLoader().getClass().getName());
		/*
		 * 运行结果为null，不代表它没类加载器，(如果没有那是谁加载它的呢？)而是加载它的加载器是BootStrap（一个特殊的类加载器，
		 * 是c++写的二进制代码），BootStrap不是一个java对象，所以上面打印null。
		 * 空指针异常
		 * */

	}

}
