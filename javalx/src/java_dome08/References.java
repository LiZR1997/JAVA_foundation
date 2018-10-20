package java_dome08;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;



class VeryBig {
	private static final int SIZE = 10000;
	protected long[] la = new long[SIZE];
	private String ident;
	public VeryBig(String id) {
		ident = id;
	}
	public String toString() {
		return ident;
	}
	protected void finalize() {
		System.out.println("Finishing" + ident);
	}
}

public class References {

	/**
	 * @param args
	 */
	
	private static ReferenceQueue<VeryBig> rq = new ReferenceQueue<VeryBig>();
	
	public static void checkQueue() {
		Reference<? extends VeryBig> inq = rq.poll();
		if(inq != null)
			System.out.println("In Queue:" + inq.get());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10 ;
		if(args.length > 0)
			size = new Integer(args[0]);
		LinkedList<SoftReference<VeryBig>> sa = new LinkedList<SoftReference<VeryBig>>();
		for(int i = 0 ; i <size ; i++ )
		{
			sa.add(new SoftReference<VeryBig>(new VeryBig("Soft" + i), rq));
			System.out.println("just created" + i + sa.getLast());
			checkQueue();
		}
		LinkedList<WeakReference<VeryBig>> we = new LinkedList<WeakReference<VeryBig>>();
		for(int i = 0 ; i < size ; i++)
		{
			we.add(new WeakReference<VeryBig>(new VeryBig("Weak" + i), rq));
			System.out.println("just created" + i + we.getLast());
			we.set(i, null);
			checkQueue();
		}

	}

}
