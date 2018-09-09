package java_dome05.Done05_02;

public class text1 extends text{

	static int n ;
	private static void text() {
		 n = 2;
	}
	static {
		text();
	}
	public void c(){
		System.out.println(n);
	}
}
