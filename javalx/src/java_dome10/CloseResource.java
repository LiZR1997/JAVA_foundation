package java_dome10;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CloseResource {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		ServerSocket server = new ServerSocket(8080);
		InputStream socketInput = new Socket("localhost",8080).getInputStream();
		exec.execute(new IOBlocked(socketInput));
		exec.execute(new IOBlocked(System.in));
		TimeUnit.MILLISECONDS.sleep(100);
		System.out.println("000000000000000");
		exec.shutdownNow();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("000000000000000");
		socketInput.close();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("000000000000000");
		System.in.close();
		
		
		

	}

}
