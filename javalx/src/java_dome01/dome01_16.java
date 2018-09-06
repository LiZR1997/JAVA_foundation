package java_dome01;

public class dome01_16 {
	class Contents {
		private int i = 11;
		public int value() { return i ;}
	}
	
	class Destination {
		private String label;
		public Destination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	public Destination to(String s){
		return new Destination(s);
	}
	public Contents contents() {
		return new Contents();
	}
	public void ship(String dest) {
		Contents contents = contents();
		Destination destination = to(dest);
		System.out.println(destination.readLabel());
	}

	public static void main(String[] args) {
		dome01_16 d = new dome01_16();
		d.ship("111111");
		dome01_16 d1 = new dome01_16();
		dome01_16.Contents contents = d1.contents();
		dome01_16.Destination destination = d1.to("222222");
		System.out.println(destination.readLabel());
	
	}

}
