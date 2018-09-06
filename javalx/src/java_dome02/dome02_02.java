package java_dome02;

public class dome02_02<T> {
	
	private T a;
	
	public void set(T a) {
		this.a = a;
	}

	public dome02_02(T a) {
		this.a = a;
		// TODO Auto-generated constructor stub
	}
	
	public T get() {
		return a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dome02_02<Automobile> dome = new dome02_02<Automobile>(new Automobile());
		Automobile automobile = dome.get();
	}

}
