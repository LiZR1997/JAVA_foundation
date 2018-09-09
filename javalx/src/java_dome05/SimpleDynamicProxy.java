package java_dome05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * java ��̬����demo
 * */
//.InvocationHandler�ӿ���proxy����ʵ���ĵ��ô������ʵ�ֵ�һ���ӿڣ�ÿһ��proxy����ʵ������һ�������ĵ��ô�������ڴ���ʵ�����÷���ʱ���������ñ�������ɵ����ô�������invoke����
class DynamicProxyHandler implements InvocationHandler {

	private Object proxied ;
	public DynamicProxyHandler(Object proxied) {
		// TODO Auto-generated constructor stub
		this.proxied = proxied;
	}
	@Override
	/**
	    * proxy:������������ʵ�������com.sun.proxy.$Proxy0
	    * method:������Ҫ����ĳ��������ʵ�ķ�����Method����
	    * args:ָ��������󷽷����ݵĲ���
	    */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("**** proxy ��ʵ�Ĵ������   " + proxy.getClass().getName() + ", method ����������ķ���" + method.getName() + ", args ������󴫵ݵĲ��� " + args);
		System.out.println("****          ��ʵ�Ķ���"+this.proxied.getClass().getName());
		if(args != null)
			for(Object object : args)
				System.out.println("  " + object);
		//����ʵ�Ķ���ִ��֮ǰ���ǿ�������Լ��Ĳ���
	    System.out.println("before invoke������");
		if(method.getName().equals("doSomething"))
			System.out.println("10086");
		Object invoke = method.invoke(proxied, args);//�����󴫸�������Ķ��󣬲������Ҫ�Ĳ���
		System.out.println("after invoke������");
		//����ʵ�Ķ���ִ��֮�����ǿ�������Լ��Ĳ���
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
		RealObject real = new RealObject();//����RealObject
		comsumer(real);
		System.out.println("");
        //Proxy.newProxyInstance(loader, interfaces, h)���Զ�̬��������
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));
		/**
		 * loader��һ��classloader���󣬶��������ĸ�classloader��������ɵĴ�������м���
           interfaces��һ��interface�������飬��ʾ���ǽ�Ҫ�����ǵĴ�������ṩһ��ʲô���Ľӿڣ���������ṩ������һ���ӿڶ������飬��ôҲ���������˴�����ʵ������Щ�ӿڣ�������Ϳ��Ե��ýӿ������������з�����
           h��һ��InvocationHandler���󣬱�ʾ���ǵ���̬���������÷�����ʱ����������һ��InvocationHandler�����ϣ�������������á�
		 * */
		System.out.println("");
		comsumer(proxy);


	}

}
