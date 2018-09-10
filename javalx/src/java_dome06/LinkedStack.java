package java_dome06;

public class LinkedStack<T> {

	/**
	 * ���Ա����ʽ��ʾ
	 * @param args
	 */
	
	private static class Node<T> {        //�ڲ���
		T item;
		Node<T> next ;
		Node() {
			// TODO Auto-generated constructor stub
		item = null;
		next = null;
		}
		Node(T item , Node<T> next) {
			this.item = item;
			this.next = next;
		}
		boolean end() {
			return item == null && next == null;
		}
	}
	
	private Node<T> top = new Node<T>();//����ͷ�ڵ�
	
	public void push(T itme) {
		top = new Node<T>(itme,top);//�����µĶ���
	}
	
	/*
	 *  ���Ԫ�غ� ÿ���ڵ㣨�ڲ�����󣩵�nextָ��ɵ��Ǹ��ڵ�
	 * 
	 *         ��                   T item              ��               T item
	 *  null <-  Node<T> next �� <- (new)   Node<T> next ��
	 * */
	
	public T pop() {
		T result = top.item;
		if(!top.end())
			top = top.next;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedStack<String> iss = new LinkedStack<String>();
		iss.push("12121");
		iss.push("10086");
		iss.push("10001");
		System.out.println(iss.pop());
		System.out.println(iss.pop());
	}

}
