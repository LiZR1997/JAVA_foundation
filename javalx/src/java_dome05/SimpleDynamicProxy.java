package java_dome05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * java 动态加载demo
 * */
//.InvocationHandler接口是proxy代理实例的调用处理程序实现的一个接口，每一个proxy代理实例都有一个关联的调用处理程序；在代理实例调用方法时，方法调用被编码分派到调用处理程序的invoke方法
class DynamicProxyHandler implements InvocationHandler {

	private Object proxied ;
	public DynamicProxyHandler(Object proxied) {
		// TODO Auto-generated constructor stub
		this.proxied = proxied;
	}
	@Override
	/**
	    * proxy:代理类代理的真实代理对象com.sun.proxy.$Proxy0
	    * method:我们所要调用某个对象真实的方法的Method对象
	    * args:指代代理对象方法传递的参数
	    */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("**** proxy 真实的代理对象   " + proxy.getClass().getName() + ", method 代理对象代理的方法" + method.getName() + ", args 代理对象传递的参数 " + args);
		System.out.println("****          真实的对象"+this.proxied.getClass().getName());
		if(args != null)
			for(Object object : args)
				System.out.println("  " + object);
		//在真实的对象执行之前我们可以添加自己的操作
	    System.out.println("before invoke。。。");
		if(method.getName().equals("doSomething"))
			System.out.println("10086");
		Object invoke = method.invoke(proxied, args);//将请求传给被代理的对象，并传入必要的参数
		System.out.println("after invoke。。。");
		//在真实的对象执行之后我们可以添加自己的操作
		return invoke;
	}
	
}

public class SimpleDynamicProxy {

	/**
	 * @param args
	 */
	
	public static void comsumer(Interface interface1) {
		interface1.doSomething();
		interface1.somthingElse("2222222");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealObject real = new RealObject();//代理RealObject
		comsumer(real);
		System.out.println("");
        //Proxy.newProxyInstance(loader, interfaces, h)可以动态创建代理
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));
		/**
		 * loader：一个classloader对象，定义了由哪个classloader对象对生成的代理类进行加载
           interfaces：一个interface对象数组，表示我们将要给我们的代理对象提供一组什么样的接口，如果我们提供了这样一个接口对象数组，那么也就是声明了代理类实现了这些接口，代理类就可以调用接口中声明的所有方法。
           h：一个InvocationHandler对象，表示的是当动态代理对象调用方法的时候会关联到哪一个InvocationHandler对象上，并最终由其调用。
		 * */
		System.out.println("");
		comsumer(proxy);


	}

}
