package java_dome01;

public class dome01_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0 ;
		outer:
			for( ; true ; )
			{
				inner:
					for( ; i <= 10 ; i++)
					{
						System.out.println("i="+i);
						if( i == 2 )
						{
							System.out.println("continue");
							continue;
						}
						if( i == 3)
						{
							System.out.println("break");
							i++;
							break;
						}
						if(i == 7)
						{
							System.out.println("continue outer");
							i++;
							continue outer;
						}
						if(i == 8)
						{
							System.out.println("break outer");
							break outer;
						}
						for(int k = 0; k < 5; k++){
							if(k == 3)
							{
								System.out.println("continue inner");
								continue inner;
							}
						}
					}
			}

	}

}
