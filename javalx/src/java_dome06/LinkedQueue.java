package java_dome06;

public class LinkedQueue<T> {

	/**
	 * @param args
	 */
	
	private static class Node<T>{
		T item;
		Node<T> next;
		
		public Node() {
			// TODO Auto-generated constructor stub
			item = null;
			next = null;
		}
		
		public Node(T item ,Node<T> next) {
			// TODO Auto-generated constructor stub
			this.item = item;
			this.next = next;
		}
		
		Boolean end() {
			return item == null && next == null;
		}
	}
	
	Node<T> node = new Node<T>();
	Node<T> node1 = node;
	
	public void push(T t) {
		node.next = new Node<T>();
		node.item =t;
		node = node.next;
	}
	
	public T pop() {
		T result = node1.item;
		if(!node1.end())
			node1 = node1.next;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedQueue<String> linkedQueue = new LinkedQueue<String>();
		linkedQueue.push("10086");
		linkedQueue.push("10001");
		System.out.println(linkedQueue.pop());
		System.out.println(linkedQueue.pop());
		

	}

}
