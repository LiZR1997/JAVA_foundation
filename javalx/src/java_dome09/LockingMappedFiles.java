package java_dome09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class LockingMappedFiles {

	/**
	 * @param args
	 */
	static final int LRNFTH = 0x8FFFFFF;
	static FileChannel fc;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		fc = new RandomAccessFile("D:/javaio/DirList/02.txt", "rw").getChannel();
		MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE, 0, LRNFTH);
		for(int i = 0 ; i < LRNFTH ; i ++ )
			out.put((byte) 'x');
	}
	
	private static class LockAndModify extends Thread {
		private ByteBuffer buffer ;
		private int start , end;
		public LockAndModify(ByteBuffer mbb , int start, int end) {
			this.start = start;
			this.end = end;
			mbb.limit(end);
			mbb.position(start);
			buffer = mbb.slice();
			start();
		}
		
		public void run() {
			try {
				FileLock fl = fc.lock(start, end, false);
				System.out.println("Locked" + start + "to" + end);
				while(buffer.position() < buffer.limit() -1) {
					buffer.put((byte)(buffer.get() + 1 ));
					fl.release();
				System.out.println("release" + start + "to" + end);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
		}
		
	}

}
