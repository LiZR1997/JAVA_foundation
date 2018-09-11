package java_dome06;

public class Fibonacci implements Generator<Integer> {

	/**
	 * @param args
	 */
	
	private int conut = 0;
//	private int conut1 = 0;
	
	private int fib(int n){ 
		if(n <= 1)
			return 1 ;
		else 
			return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibonacci = new Fibonacci();
		for(int i = 0 ; i <=17 ; i++)
			System.out.print(fibonacci.next() + " ");
		for(int i = 0 ; i <=17 ; i++)
			System.out.print(fibonacci.fib(i) + " ");
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return fib(conut++);
	}

}
