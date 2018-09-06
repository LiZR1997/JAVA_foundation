package java_dome01;

class Soup1 {
	private Soup1() {}
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {}
	private static Soup2 ps1 = new Soup2();
	public static Soup2 access() {
		return ps1 ;
	}
	public void f() {}
}

public class dome01_08 {

	/**
	 * @param args
	 */
	void testPrivate() {
		
	}
	
	void testStatic() {
		Soup1 soup1 = Soup1.makeSoup();
	}
	
	void testStringleton() {
		Soup2.access().f();
	}
	

}
