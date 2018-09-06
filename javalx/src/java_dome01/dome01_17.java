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
		//���ڲ����в�û�� Object itmes ����ʹ�õ���Χ�豸�е�private Object
		//�ڲ�����Է�����Χ�ķ������ֶ�
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
