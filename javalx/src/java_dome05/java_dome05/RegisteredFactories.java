package java_dome05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

class Part {
	
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();//存放所有的对象工厂
    //在静态块中添加对象工厂
	
	static {
		partFactories.add(new f1.Factory());
		partFactories.add(new f2.Factory());
		partFactories.add(new f3.Factory());
	}
	private static Random random = new Random(9);
	public static Part RandomPart(){
		int n = random.nextInt(partFactories.size());
		return partFactories.get(n).creat();
	}
}

class F extends Part{};

class f1 extends F{
	public static class Factory implements java_dome05.Factory<f1>{

		@Override
		public f1 creat() {
			// TODO Auto-generated method stub
			return new f1();
		}	
	}
}

class f2 extends F{
	public static class Factory implements java_dome05.Factory<f2>{

		@Override
		public f2 creat() {
			// TODO Auto-generated method stub
			return new f2();
		}
		
	}
}

class f3 extends F{
	public static class Factory implements java_dome05.Factory<f3>{

		@Override
		public f3 creat() {
			// TODO Auto-generated method stub
			return new f3();
		}
		
	}
}

public class RegisteredFactories {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 3 ; i++)
			System.out.println(Part.RandomPart());
			

	}

}
