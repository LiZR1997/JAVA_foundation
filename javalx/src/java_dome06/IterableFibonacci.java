package java_dome06;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

	/**
	 * @category iterable ʵ��쳲���������
	 * @param args
	 */
	
	private int n ;
	
	public IterableFibonacci(int count) {
		// TODO Auto-generated constructor stub
		n = count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i : new IterableFibonacci(18))//������Ҫִ�еĴ���
			System.out.print(i + " ");

	}

	@Override
	public Iterator<Integer> iterator() {          //ʵ��Iterable�ӿڵķ���
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
				n--;       //ÿ��ִ�����һ
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
