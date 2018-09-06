package java_dome02;

class TwoTuple<A,B> {
	public final A first;
	public final B second;
	public TwoTuple(A a , B b) {
		first = a;
		second = b;
	}
	public String toString() {
		return "("+first+","+second+")";
	}
}

class ThreeTuple<A,B,C> extends TwoTuple<A, B> {
	public final C third;
	public ThreeTuple(A a, B b, C c) {
		super(a, b);
		third = c;
	}
	public String toString() {
		return "("+first+","+second+","+third+")";		
	}
}

class Amphibian {
}

class Vehicle {
}

public class dome01_03 {

	static TwoTuple<String ,  Integer> f() {
		return new TwoTuple<String, Integer>("hi", 47);
	}
	static ThreeTuple<String, Integer, Amphibian> g(){
		return new ThreeTuple<String, Integer, Amphibian>("ni", 66, new Amphibian());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoTuple<String , Integer > tuple1 = f();
		System.out.println(tuple1);
		System.out.println(g());

		
	}

}
