package java_dome06;

import java.util.Scanner;


public class ceshi{

	/**
	 * @param args
	 */
	private static class node{
		Object item;
		node next;
		node() {
			// TODO Auto-generated constructor stub
		item = null;
		next = null;
		}
		node(Object item ) {
			this.item = item;
			this.next = next;
		}
		boolean end() {
			return item == null && next == null;
		}
	}
	
	private node top = new node();
	
	public Object GreateGList( Object object) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(s);
		if(s.equals("#"))
		{	
			System.out.println(s);
			return GreateGList(push(new node(),s));
		}
		else if( s.equals("##"))
			return GreateGList(push(new node(),new node()));
		else 
		{
			System.out.println(1212);
			return push(null, null);
		}
	}
	
	public Object push( node node ,Object object) {
		System.out.println("3" + object);
		top.next = node;
		top.item = object;
		if(top.item == top.next)
		return top.item;
		else
			return top.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ceshi cs = new ceshi();
		System.out.println(cs.GreateGList(new node()));

	}

}
