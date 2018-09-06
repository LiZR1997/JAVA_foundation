package java_dome01;

/**
 * @author ∂‡Ã¨
 * */

class Shape {
	protected void draw() {}
	protected void erase() {}
}

class as1 extends Shape {
	protected void draw() {
		System.out.println("as1-draw");
	}
	protected void erase() {
		System.out.println("as1-erase");
	}
}

class as2 extends Shape {
	protected void draw() {
		System.out.println("as2-draw");		
	}
	protected void erase() {
		System.out.println("as2-erase");
		
	}
}
public class dome01_12 {

	/**
	 * @param args
	 */
	static void dome(Shape shape) {
		shape.draw();
		shape.erase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		as1 as1 = new as1();
		dome(as1);
		as2 as2 = new as2();
		dome(as2);
	}
}
