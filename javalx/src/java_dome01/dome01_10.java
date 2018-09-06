package java_dome01;

class Villain {
	private String name;
	protected void set(String nm) { name = nm; }
	public Villain(String name ) { this.name = name; }
	public String toString(){
		return "12323" + name;
	}
}

public class dome01_10 extends Villain{

	private int Number;
	public dome01_10(String name , int Number) {
		super(name);
		this.Number = Number;
		// TODO Auto-generated constructor stub
	}
	
	public void change(String name , int Number){
		set(name);
		this.Number = Number;		
	}
	
    public String toString(){
    	return "1111111" + Number + "2222222222" + super.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dome01_10 dome01_10 = new dome01_10("li", 12);
		System.out.println(dome01_10);
		/**
		 * 在Java中，所有的对象都是继承自Object，自然继承了toString方法，在当使
		 * 用System,out.println()里面为一个对象的引用时，自动调用toString方
		 * 法讲对象打印出来。如果重写了tostring方法则调用重写的toString 方法。*/
		dome01_10.change("Bob", 19);
		System.out.println(dome01_10);

	}

}
