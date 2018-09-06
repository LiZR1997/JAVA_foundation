package java_dome03;

class SimpleException extends Exception {}

public class InheritingExceptions {
	
	public void f() throws SimpleException{
		System.out.println("T");
		throw new SimpleException();
	} 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
