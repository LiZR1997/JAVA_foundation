package java_dome01;

/**
 * @category 方法重载
 * */
class People{
	
	double getArea(double x , double y){
		return x*y ;
	}
	int getArea(int x , int y){
		return x*y;
	}
	
}
public class dome01_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People();
		System.out.println("double类型参数，10.0，66.0,"+people.getArea(10.0, 66.0));
		System.out.println("int类型参数，9,9,"+people.getArea(9, 9));

	}

}
