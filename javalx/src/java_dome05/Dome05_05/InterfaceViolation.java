package java_dome05.Dome05_05;

class B implements A {

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}
	
	public void g() {
		
	}
	
}

public class InterfaceViolation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.f();
		System.out.println(a.getClass().getName());
		if(a instanceof B) {
			B b = (B)a;
			b.g();
		}
	}

}
