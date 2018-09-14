package java_dome06;

class Building {}

class Hose extends Building {
	
}

public class Dome06_05_01<T> {

	/**
	 * @param args
	 */
	
	Class<T> kind;
	public Dome06_05_01(Class<T> kind) {
		this.kind = kind;
	}
	public boolean f(Object arg) { 
		return kind.isInstance(arg);     //สตภýปฏ
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dome06_05_01<Building> c1 = new Dome06_05_01<Building>(Building.class);
		System.out.println(c1.f(new Building()));
		System.out.println(c1.f(new Hose()));
		Dome06_05_01<Hose> c2 = new Dome06_05_01<Hose>(Hose.class);
		System.out.println(c2.f(new Building()));
		System.out.println(c2.f(new Hose()));

	}

}
