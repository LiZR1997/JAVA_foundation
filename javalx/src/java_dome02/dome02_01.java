package java_dome02;

class Automobile {	
}
public class dome02_01 {

	/**
	 * @param args
	 */
	
	private Object a;
	public dome02_01(Object a) {
		this.a = a;
	}
	public void set(Object a) {
		this.a = a;
	}
	public Object get() {
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dome02_01 dome = new dome02_01(new Automobile());//向上转型，所有的类都继承自Object 
		Automobile automobile = (Automobile) dome.get();
		dome.set("qwer");//向上转型
		String string = (String) dome.get();
		dome.set(1);
		Integer x = (Integer) dome.get();//强制类型转换
	}

}
