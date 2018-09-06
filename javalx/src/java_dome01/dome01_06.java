package java_dome01;

/**
 * @category 静态数据的初始化
 * @see 这是一个特殊的实例，在程序执行时，先要执行main（）《静态方法》
 *      必须加载StaticInitialization类，导致静态域Table和Cupboard被
 *      初始化，这进而导致对应的类也被加载
 * */

class Bowl{
	Bowl( int marker ){
		System.out.println("Bowl("+marker+")");
	}

	void f1( int marker){
		System.out.println("f1("+marker+")");
	}
}

class Table{
	static Bowl bowl1 = new Bowl(1);
	Table(){
		System.out.println("Table()");
		bowl2.f1(1);
	}
	void f2( int marker ){
		System.out.println("f2("+marker+")");
	}
	static Bowl bowl2 = new Bowl(2);
}

class Cupboard{
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	public Cupboard() {
		// TODO Auto-generated constructor stub
		System.out.println("Cupboard");
		bowl4.f1(2);
	}
	void f3( int marker ){
		System.out.println("f3("+marker+")");
	}
	static Bowl bowl5 = new Bowl(5);
}

public class dome01_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
	}
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();

}
