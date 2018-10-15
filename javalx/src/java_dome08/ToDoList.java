package java_dome08;

import java.util.PriorityQueue;

/**
 * @author 55499
 *@category 优先级队列
 */
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem>{
    static class ToDoItem implements Comparable<ToDoItem> {

    	private char primary;
    	private int secondary;
    	private String item;

		public ToDoItem(char primary, int secondary, String item) {
			super();
			this.primary = primary;
			this.secondary = secondary;
			this.item = item;
		}

		@Override
		public int compareTo(ToDoItem o) {
			// TODO Auto-generated method stub
			if(primary > o.primary)
				return +1;
			if(primary == o.primary)
				if(secondary > o.secondary)
					return +1;
			else if (secondary == o.secondary) {
				return 0;
			}
			return -1;
		}
		
		public String toString() {
			return Character.toString(primary) + secondary + ":" + item;
		}
    	
    }
	/**
	 * @param args
	 */
    public void add(char primary, int secondary, String item) {
    	super.add(new ToDoItem(primary,secondary,item));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDoList toDoList = new ToDoList();
		for (int i = 0; i < 5; i++) {
			toDoList.add('i',i,"i");
		}
		while(!toDoList.isEmpty())
			System.out.println(toDoList.remove());

	}

}
