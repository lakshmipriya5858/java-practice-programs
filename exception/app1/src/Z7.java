class Z7
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
		System.out.println(1);
		int i = 10/0;
		System.out.println(2);
		}
		
		catch ( ArithmeticException ex) 
		{
		  System.out.println(3);
		  int i = 10/ 0;
		  System.out.println(4);

		}
		finally
		{
		  System.out.println("fromfinally");
		 }
		
		
		System.out.println("main end");


	}
}
/*
finally will excute in any way
finally block is a optional block
finally should be the last block
without try, catcth and final will give CTE


*/