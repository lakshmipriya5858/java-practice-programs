class Z25
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for( int i=1;i<=5;i++);
		{
					System.out.println("loop1 body stmt 1:"+i);
		}
				            System.out.println("main end");
	}
}
//compile time error i used outsid ethe for loop 
//i is localised variable 