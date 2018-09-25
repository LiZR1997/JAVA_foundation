package java_dome08;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class Dome_LinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linklList = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6));
		Iterator<Integer> iterator = linklList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("");
		linklList.addAll(6, Arrays.asList(0,0,0,0,0));
		linklList.remove();
		for (Integer integer : linklList) {
			System.out.print(integer + "");
		}
		System.out.println(linklList.getFirst() + "*******");
		System.out.println(linklList.getLast() + "********");
		System.out.println(linklList.pop());
		ListIterator<Integer> listIterator = linklList.listIterator();
		//ListIterator迭代器 ， 其中LinkList实现了，listItrtator()方法
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next());
		}
		System.out.println("");
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous());
		}
		Iterator<Integer> iterator2 = linklList.descendingIterator();
		while(iterator2.hasNext()) {
			System.out.print(" " + iterator2.next());
		}
/*  
 * LinkList 双向链表中的节点
 *  private static class Entry<E> {
	E element;
	Entry<E> next;       前置结点
	Entry<E> previous;   后置结点

	Entry(E element, Entry<E> next, Entry<E> previous) {
	    this.element = element;
	    this.next = next;
	    this.previous = previous;
	}
    }
 *      
 *      
 *      LinkList中的addAll()方法
	    public boolean addAll(int index, Collection<? extends E> c) {
	        if (index < 0 || index > size)
	            throw new IndexOutOfBoundsException("Index: "+index+
	                                                ", Size: "+size);
	        Object[] a = c.toArray();
	        int numNew = a.length;
	        if (numNew==0)
	            return false;
		modCount++;

	        Entry<E> successor = (index==size ? header : entry(index));
	        若插入的节点的位置等于头结点的位置则返回该节点，否则返回查找到的结点
	        Entry<E> predecessor = successor.previous;
	        找到插入位置的前一个结点
		for (int i=0; i<numNew; i++) {
	            Entry<E> e = new Entry<E>((E)a[i], successor, predecessor);
	        创建结点，设置它的前置和后置节点
	            predecessor.next = e;
	        将前一个结点指向该节点
	            predecessor = e;
	          插入位置的前一个节点的后置结点指向新的结点
	        }
	        successor.previous = predecessor;
	        调整该链表的大小
	        size += numNew;
	        return true;
	    }
*/
	}

}
