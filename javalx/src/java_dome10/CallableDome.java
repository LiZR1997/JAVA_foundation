package java_dome10;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskWithResult implements Callable<String> {
//实现Callable接口可以产生返回值
	private int id;	
	
	public TaskWithResult(int id) {
		this.id = id;
	}


	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "result of TaskWithResult" + id;
	}
	
}

public class CallableDome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i = 0 ; i < 10 ; i++)
			results.add(exec.submit(new TaskWithResult(i)));
		    //submit()返回future对象
		for(Future<String> fs : results)
			try {
				System.out.println(fs.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				exec.shutdown();
			}

	}

}
