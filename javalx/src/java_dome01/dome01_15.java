package java_dome01;

class A {
	interface B {
		void f();
	}
	public class BImp implements B {

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	private class BImp2 implements B {

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	public interface C {
		void f();
	}
	class CImp implements C {

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private interface D {
		void f();
	}
	private class DImp implements D {
		public void f() {}
	}
	private class DImp2 implements D {

		@Override
		public void f() {
			// TODO Auto-generated method stub	
		}	
	}
	public D getD() { return new DImp2();}
	private D dRef ;
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E {
	interface G {
		void f();
	}
	public interface H {
		void f();
	}
	void g();
	
}
public class dome01_15 {

	/**
	 * @param args
	 */
	public class BImp implements A.B {
			public void f() {}
		}
	
	class CImp implements A.C {
		public void f() {		
		}
	}
	class EImp implements E {
		public void g() {}
	}
	class EGImp implements E.G {

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		}
	class EImp2 implements E {

		@Override
		public void g() {
			// TODO Auto-generated method stub
			
		}
		class EG implements E.G {

			@Override
			public void f() {
				// TODO Auto-generated method stub
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A a2 = new A();
		a2.receiveD(a.getD());

	}

}
