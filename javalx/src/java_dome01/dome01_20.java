package java_dome01;

abstract class Base {
	public Base(int i) {
		System.out.println("���"+i);
	}
	public abstract void f();
}

public class dome01_20 {

	/**
	 * @param args
	 */
	
	public static Base getBase(int i) {
		return new Base(i) {
			{ 
				System.out.println("�����ڲ����ڵķ�����������");
			}
			@Override
			public void f() {
				System.out.println("11111");
				
			}
			
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = getBase(66);
		base.f();

	}

}
