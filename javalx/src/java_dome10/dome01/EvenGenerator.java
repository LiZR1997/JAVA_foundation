package java_dome10.dome01;

public  class EvenGenerator extends IntGenerator {

	private volatile int currentEvenValue = 1;
	@Override
	public  int next() {
		// TODO Auto-generated method stub
		++currentEvenValue;
		++currentEvenValue;
		return currentEvenValue;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenChecker.test(new EvenGenerator());

	}

}
