package java_dome03;

class MyException extends Exception {
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(String msg){
		super(msg);
	}
}

public class FullConstructors {

	/**
	 * @param args
	 */
	public static void f() throws MyException {
	    System.out.println("f()");
	    throw new MyException();
	}
	
	public static void g() throws MyException {
		System.out.println("g()");
		throw new MyException("g()");		
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}

}
