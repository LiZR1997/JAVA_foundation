package java_dome06;

class BasicHolder<T> {
	T elemen;
	void set(T t) {
		this.elemen = t;
	}
	T get() {
		return elemen;
	}
	void f() {
		System.out.println(elemen.getClass().getSimpleName());
	}
}

class Subtype extends BasicHolder<Subtype> {}
/*
 * ���������������������
 * ���ͻ�������һ�����е�����Ĺ���ģ��
 * ���в����ཫʹ��ȷ�е����Ͷ����ǻ�������
 * */
public class Dome06_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtype sub1 = new Subtype() , sub2 = new Subtype();
		sub1.set(sub2);
		Subtype sub3 = sub1.get();
		sub1.f();
		
	}

}
