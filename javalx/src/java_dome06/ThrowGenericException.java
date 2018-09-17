package java_dome06;

import java.util.ArrayList;
import java.util.List;

interface Processor<T , E extends Exception> {
	void process(List<T> resultCollector) throws E;
}

class ProcessRuner<T , E extends Exception> extends ArrayList<Processor<T , E>>{

	List<T> processAll() throws E {
		List<T> resultCollector = new ArrayList<T>();
		for(Processor<T,E> processor : this)
			processor.process(resultCollector);
		return resultCollector;
	}
	
}

class Failure1 extends Exception {}

class Processor1 implements Processor<String, Failure1> {

	static int count = 3;
	@Override
	public void process(List<String> resultCollector) throws Failure1 {
		// TODO Auto-generated method stub
		if (count-- > 0) {
			resultCollector.add("Hep!");
		}
		else
			resultCollector.add("Ho!");
		if(count < 0)
			throw new Failure1();
	}
	
}

class Failure2 extends Exception {}

class Processor2 implements Processor<Integer, Failure2> {

	static int count = 2;
	@Override
	public void process(List<Integer> resultCollector) throws Failure2 {
		// TODO Auto-generated method stub
		if(count-- == 0)
			resultCollector.add(47);
		else
			resultCollector.add(11);
		if(count < 0)
			throw new Failure2();
	}
	
}

public class ThrowGenericException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessRuner<String, Failure1> runer = new ProcessRuner<String, Failure1>();
		for(int i = 0 ; i < 3; i++)
			runer.add(new Processor1());
		try {
			System.out.println(runer.processAll());
		} catch (Failure1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ProcessRuner<Integer, Failure2> runer2 = new ProcessRuner<Integer , Failure2>();
		for(int i = 0 ; i < 3 ; i++)
			runer2.add(new Processor2());
		try {
			System.out.println(runer2.processAll());
		} catch (Failure2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
