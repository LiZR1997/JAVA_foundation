package java_dome06;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

	/**
	 * @category iterable 实现斐波那契数列
	 * @param args
	 */
	
	private int n ;
	
	public IterableFibonacci(int count) {
		// TODO Auto-generated constructor stub
		n = count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i : new IterableFibonacci(18))//传递所要执行的次数
			System.out.print(i + " ");

	}

	@Override
	public Iterator<Integer> iterator() {          //实现Iterable接口的方法
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return n > 0;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				n--;       //每次执行完减一
				return IterableFibonacci.this.next();
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
				
			}
		};
	}

}
