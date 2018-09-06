package java_dome01;

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface Canfly {
	void fly();
}

class ActionCharacter {
	public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, Canfly {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}

class H1 extends Hero {
	
}
public class dome01_14 {

	/**
	 * @param args
	 */
	public static void t(CanFight x) { x.fight(); }

	public static void u(CanSwim x ) { x.swim(); }
	
	public static void v(Canfly x ) { x.fly(); }
	
	public static void w(ActionCharacter x ) { x.fight(); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero hero = new Hero();
		t( hero );
		u( hero );//实现接口向上转型
		v( hero );
		w( hero );
		H1 h1 = new H1();
		t( h1 );
		u( h1 );
		v( h1 );
		w( h1 );

	}

}
