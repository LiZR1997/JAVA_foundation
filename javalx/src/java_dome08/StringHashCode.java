package java_dome08;

public class StringHashCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h1 = new String();
		String h2 = new String();
		h1 = "qwe";
		h2 = "qwe";
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		//如果程序中有多个String对象，且String对象都包含相同的字符则这些String对象均映射到同一区域
		//则hashCode相同

	}

}
