package java_dome01;

/**
 * @category this关键字将当前对象传递给其他方法
 * */
class Person{
	
	public void eat(Apple apple){
		Apple peeled = apple.getPeeled();
		System.out.print("1");
		
	}
}
class Peeler{
	static Apple peel(Apple apple){
		System.out.print("2");
		return apple;
	}
}

class Apple{

	Apple getPeeled(){
		System.out.print("3");
		return Peeler.peel(this);
	}
}
public class dome01_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Person().eat(new Apple());
	}

}
