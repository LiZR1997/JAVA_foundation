package java_dome01;

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class dome01_17 {

	/**
	 * @param args
	 */
	private Object[] items;
	private int next = 0;
	public dome01_17(int size) {
		items = new Object[size];
	}
	public void add(Object x){
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceSelectot implements Selector{
		//该内部类中并没有 Object itmes 而是使用的外围设备中的private Object
		//内部类可以访问外围的方法和字段
		private int i = 0;

		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == items.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i < items.length) i++;
		}
		
	}
	public Selector selector() {
		return new SequenceSelectot();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dome01_17 dome01_17 = new dome01_17(10);
		for(int i = 0 ; i < 10 ; i++)
			dome01_17.add(Integer.toString(i));
		Selector selector = dome01_17.selector();
		while(!selector.end())
		{
			System.out.println(selector.current());
			selector.next();
		}
	}

}
