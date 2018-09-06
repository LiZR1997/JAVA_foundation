package java_dome01;

class Instrument {
	void play( int n) {	
	System.out.println("Instrument.play()"+n);
	}
	String what() {
		return "Instument";
	}
	void adjust() {
		System.out.println("adjusting Instrument");
	}
}

class wind extends Instrument {
	void play( int n ){
		System.out .println("wind.play()"+n);
	}
	String what() {
		return "wind";
	}
	void adjust() {
		System.out.println("adjusting.wind");
	}
}

class Stringed extends Instrument {
	void play( int n){
		System.out.println("Insrument.play()"+n);
	}
	String what(){
		return "Stringed";
	}
	void adjust() {
		System.out.println("adjusting.Stringed");
	}
}

public class dome01_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
