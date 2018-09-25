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
		//ListIterator������ �� ����LinkListʵ���ˣ�listItrtator()����
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
 * LinkList ˫�������еĽڵ�
 *  private static class Entry<E> {
	E element;
	Entry<E> next;       ǰ�ý��
	Entry<E> previous;   ���ý��

	Entry(E element, Entry<E> next, Entry<E> previous) {
	    this.element = element;
	    this.next = next;
	    this.previous = previous;
	}
    }
 *      
 *      
 *      LinkList�е�addAll()����
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
	        ������Ľڵ��λ�õ���ͷ����λ���򷵻ظýڵ㣬���򷵻ز��ҵ��Ľ��
	        Entry<E> predecessor = successor.previous;
	        �ҵ�����λ�õ�ǰһ�����
		for (int i=0; i<numNew; i++) {
	            Entry<E> e = new Entry<E>((E)a[i], successor, predecessor);
	        ������㣬��������ǰ�úͺ��ýڵ�
	            predecessor.next = e;
	        ��ǰһ�����ָ��ýڵ�
	            predecessor = e;
	          ����λ�õ�ǰһ���ڵ�ĺ��ý��ָ���µĽ��
	        }
	        successor.previous = predecessor;
	        ����������Ĵ�С
	        size += numNew;
	        return true;
	    }
*/
	}

}
