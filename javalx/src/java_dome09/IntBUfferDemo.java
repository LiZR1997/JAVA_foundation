package java_dome09;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class IntBUfferDemo {

	/**
	 * @param args
	 */
	private static final int BSIZE = 1024;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		IntBuffer ib = bb.asIntBuffer();
		ib.put(new int[] {1,2,3,4,5,6});
		System.out.println(ib.get(3));
		ib.put(3,0);
		ib.put(77);
		ib.flip();
		while( ib.hasRemaining() ) {
			int i = ib.get();
			System.out.println(i);
		}

	}

}
