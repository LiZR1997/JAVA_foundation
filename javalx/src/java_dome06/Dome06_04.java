package java_dome06;

public class Dome06_04 {

	public <T> void f(T t) {
		System.out.println(t.getClass().getSimpleName());
	}
	/**
	 * @category ·ºÐÍ·½·¨
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dome06_04 gm = new Dome06_04();
		gm.f(1);
		gm.f(" ");
		gm.f("c");
		gm.f("qwert");
		gm.f(gm);
	}

}
