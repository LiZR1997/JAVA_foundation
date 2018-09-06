package java_dome01;

public class dome01_18 {

	/**
	 * @param args
	 */
	void f() {System.out.println("DotThis.f()");}
	public class Inner {
		public dome01_18 outer() {
			return dome01_18.this;
		}
	}
	public Inner inner() {
		return new Inner();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dome01_18 dome = new dome01_18();
		dome01_18.Inner dInner = dome.inner();
		dInner.outer().f();
		dome01_18.Inner d = dome.new Inner();

	}

}
