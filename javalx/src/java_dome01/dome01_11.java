package java_dome01;

class pe {
	protected String eat(int n) {
		return "yi" + n;
	}
}

class pe_eat {
	static String pepe(pe e,int n) {
		return e.eat(n);
	}
}
public class dome01_11 extends pe{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(pe_eat.pepe(new dome01_11() , 1));
	}

}
