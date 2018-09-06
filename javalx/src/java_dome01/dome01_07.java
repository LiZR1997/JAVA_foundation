package java_dome01;


public class dome01_07 {

	/**
	 * @param args
	 * @category 可变参数列表
	 */
	static void  f( int required , String... trailing){
		System.out.println("reqired" + required + " ");
		for(String string : trailing){
			System.out.println(string + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		f( 1 , "one");
		f( 2 , "one" , "three");
	}

}
