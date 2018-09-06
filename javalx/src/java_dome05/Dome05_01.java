package java_dome05;

import java.util.Random;

class Initable {
	static final int staticFinal = 47 ;
	static final int staticFinal2 = Dome05_01.random.nextInt(10000);
	static {
		System.out.println("Initable初始化");
	}
}

class Initable2 {
	static int staticFinal = 168;
	static {
		System.out.println("Initable2初始化");
	}
}

class Initable3 {
	static  int staticFinal = 268;
	static {
		System.out.println("Initable3初始化");
	}
}

public class Dome05_01 {

	/**
	 * @param args
	 */
	public static Random random = new Random(200);
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Class<?> initable = Initable.class;  //使用类字面常量时并不会初始化
		System.out.println("间隔1");
		System.out.println(Initable.staticFinal);//在首次引用任何元素时完成初始化
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticFinal);
		try {
			Class<?> initable3 = Class.forName("java_dome05.Initable3");//Class.forName() 在产生class引用时就进行了初始化，且需要异常处理
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}  //
		System.out.println("分割线");
		System.out.println(Initable3.staticFinal);
		

	}

}
