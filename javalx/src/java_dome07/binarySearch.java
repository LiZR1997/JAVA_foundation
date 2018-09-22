package java_dome07;

public class binarySearch {

	/**
	 * @param args
	 */
	int binarySearch1(int a[] , int n , int low ,int hight) {
		int mind = ( low + hight ) / 2;
		while(hight > low) {
			if(a[mind] == n)
				return 1 ;
			else if(n > a[mind])
				binarySearch1( a , n , mind + 1 ,hight);
			else 
				binarySearch1( a , n , low ,mind + 1);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
		binarySearch b = new binarySearch();
		if(b.binarySearch1(a , 5 , 0 , 8) > 0)
			System.out.println("111111111");

	}

}
