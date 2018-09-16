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
 * 父类用子类来代替其参数
 * 泛型基类变成了一种所有导出类的公共模版
 * 所有产生类将使用确切的类型而不是基类类型
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
