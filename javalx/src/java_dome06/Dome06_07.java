package java_dome06;

class FixedSizeStack<T> {
	private int index = 0;
	private Object[] storage;
	public FixedSizeStack(int size) {
	// TODO Auto-generated constructor stub
		storage = new Object[size];
	}
	public void push(T item) {
		storage[index++] = item;
	}
	@SuppressWarnings("unchecked")
	T pop() {
		return (T)storage[--index];
	}
}

public class Dome06_07 {

	/**
	 * @param args
	 */
	
	public static final int size = 9;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FixedSizeStack<String> string = new FixedSizeStack<String>(size);
		for(String string2 : "a,s,d,f,g,h,j,k,l".split(","))
		{
			string.push(string2);
			System.out.print("  " + string2);
		}
		for(int i = 0 ; i < size ; i++)
			System.out.print(string.pop() + " ");
	}

}








