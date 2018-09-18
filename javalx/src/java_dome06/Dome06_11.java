package java_dome06;

import java.util.Date;

/*
 * java ªÏ–Õ
 * */

interface H1 {
	long getH1();
}

class h implements H1 {

	
	private final long h1;
	
	public h() {
		// TODO Auto-generated constructor stub
		this.h1 = new Date().getSeconds();
	}
	@Override
	public long getH1() {
		// TODO Auto-generated method stub
		return h1;
	}
	
}

interface T1 {
	long getT1();
}

class t implements T1 {

	private static int count = 1;
	
	private final long tconut = count++;
	@Override
	public long getT1() {
		// TODO Auto-generated method stub
		return tconut;
	}
	
}

interface Basic{
	public void set(String val);
	public String get();
}

class B implements Basic {

	private String vlue;
	@Override
	public void set(String val) {
		// TODO Auto-generated method stub
		this.vlue = val;
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return vlue;
	}
	
}

class Mixin extends B implements H1 ,T1 {

	private H1 h1 = new h();
	private T1 t1 = new t();
	@Override
	public long getT1() {
		// TODO Auto-generated method stub
		return t1.getT1();
	}

	@Override
	public long getH1() {
		// TODO Auto-generated method stub
		return h1.getH1();
	}
	
}

public class Dome06_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mixin mixin1 = new Mixin() , mixin2 = new Mixin();
		mixin1.set("dici 1");
		mixin2.set("dici 2");
		System.out.println(mixin1.getH1() + " " + mixin1.getT1() + " " + mixin1.get());
		System.out.println(mixin2.getH1() + " " + mixin2.getT1() + " " + mixin2.get());
		

	}

}
