package java_dome01;

interface Destination {
	String readLabel();
}

interface Contents {
	int value();
}

public class dome01_19 {
	/**
	 * @category 内部类的作用域
	 * */
	public Destination destination(String s) {
		class PDestination implements Destination {

			private String label;
			private PDestination(String whereTo) {
				label = whereTo;
				
			}
			
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
			
		}
		return new PDestination(s);
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dome01_19 dome = new dome01_19();
//		Destination destination = dome.destination("11111");
//		System.out.println(destination.readLabel());
		

	}

}
