package java_dome09;

import java.nio.ByteBuffer;

public class GetData {

	/**
	 * @param args
	 */
	private static final int BSIZE = 1024;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		int i = 0;
		while( i++ < bb.limit() ) {
			if(bb.get() != 0)
				System.out.println("nonzero");
		}
		System.out.println("i=" + i);
		bb.rewind();
		bb.asCharBuffer().put("Howdy!");
		char c ;
		while((c = bb.getChar()) != 0) {
			System.out.println(c + " ");
		}
		bb.rewind();
		bb.asShortBuffer().put((short) 471140);
		System.out.println(bb.getShort());
		bb.rewind();
		bb.asLongBuffer().put(99471142);
		System.out.println(bb.getLong());
		bb.rewind();
		bb.asFloatBuffer().put(99471142);
		System.out.println(bb.getFloat());
		bb.rewind();

	}

}
