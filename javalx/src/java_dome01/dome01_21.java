package java_dome01;

interface Service {
	void mathod1();
	void mathod2();
}

interface ServiceFactory {
	Service getService();
}

class Implementionl implements Service {
	
	private Implementionl() {}

	@Override
	public void mathod1() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	public void mathod2() {
		// TODO Auto-generated method stub
		System.out.println("");
	}
	public static ServiceFactory serviceFactory = new ServiceFactory() {
		
		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new Implementionl();
		}
	};
	
}

class Implemention2 implements Service {//������,��������ת���Ժ������
	
	private Implemention2() {}

	@Override
	public void mathod1() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	public void mathod2() {
		// TODO Auto-generated method stub
		System.out.println("");	
	}
	
	public static ServiceFactory serviceFactory = new ServiceFactory() {//�����ڲ���,ʵ������ת��
		
		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new Implemention2();
		}
	};
	
}

public class dome01_21 {

	/**
	 * @param args
	 */
	
	public static void serviceConsuner(ServiceFactory serviceFactory) {
		Service service = serviceFactory.getService();
		service.mathod1();
		service.mathod2();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serviceConsuner(Implementionl.serviceFactory);
		serviceConsuner(Implemention2.serviceFactory);
	}

}
