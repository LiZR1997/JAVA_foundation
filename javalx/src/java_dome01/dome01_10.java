package java_dome01;

class Villain {
	private String name;
	protected void set(String nm) { name = nm; }
	public Villain(String name ) { this.name = name; }
	public String toString(){
		return "12323" + name;
	}
}

public class dome01_10 extends Villain{

	private int Number;
	public dome01_10(String name , int Number) {
		super(name);
		this.Number = Number;
		// TODO Auto-generated constructor stub
	}
	
	public void change(String name , int Number){
		set(name);
		this.Number = Number;		
	}
	
    public String toString(){
    	return "1111111" + Number + "2222222222" + super.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dome01_10 dome01_10 = new dome01_10("li", 12);
		System.out.println(dome01_10);
		/**
		 * ��Java�У����еĶ����Ǽ̳���Object����Ȼ�̳���toString�������ڵ�ʹ
		 * ��System,out.println()����Ϊһ�����������ʱ���Զ�����toString��
		 * ���������ӡ�����������д��tostring�����������д��toString ������*/
		dome01_10.change("Bob", 19);
		System.out.println(dome01_10);

	}

}
