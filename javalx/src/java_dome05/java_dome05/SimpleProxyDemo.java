package java_dome05;

class RealObject implements Interface {

	@Override
	public void doSomething() {
		System.out.println("doSomething");
		
	}

	@Override
	public void somthingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("somethingElse" + arg);
		
	}
	
}

class SimpleProxy implements Interface {

	private Interface proxied;
	
	public SimpleProxy(Interface proxied) {
		// TODO Auto-generated constructor stub
		this.proxied = proxied;
	}
	
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxy doSomething");
		proxied.doSomething();
	}

	@Override
	public void somthingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxy somthingElse" + arg);
		proxied.somthingElse(arg);
	}
	
}

public class SimpleProxyDemo {

	/**
	 * @param args
	 */
	public static void consumer(Interface interface1) {
		interface1.doSomething();
		interface1.somthingElse("11111111");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}

}
