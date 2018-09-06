package java_dome05;

import java.util.Random;

class Initable {
	static final int staticFinal = 47 ;
	static final int staticFinal2 = Dome05_01.random.nextInt(10000);
	static {
		System.out.println("Initable��ʼ��");
	}
}

class Initable2 {
	static int staticFinal = 168;
	static {
		System.out.println("Initable2��ʼ��");
	}
}

class Initable3 {
	static  int staticFinal = 268;
	static {
		System.out.println("Initable3��ʼ��");
	}
}

public class Dome05_01 {

	/**
	 * @param args
	 */
	public static Random random = new Random(200);
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Class<?> initable = Initable.class;  //ʹ�������泣��ʱ�������ʼ��
		System.out.println("���1");
		System.out.println(Initable.staticFinal);//���״������κ�Ԫ��ʱ��ɳ�ʼ��
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticFinal);
		try {
			Class<?> initable3 = Class.forName("java_dome05.Initable3");//Class.forName() �ڲ���class����ʱ�ͽ����˳�ʼ��������Ҫ�쳣����
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}  //
		System.out.println("�ָ���");
		System.out.println(Initable3.staticFinal);
		

	}

}
