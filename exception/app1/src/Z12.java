class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		try
		{
		System.out.println(1);
		System.exit(0);

		System.out.println(2);
		}
		
		catch ( ArithmeticException ex) 
		{
		  System.out.println(3);

		}
		finally
		{
		  System.out.println("from finally");
		 }
		
		
		System.out.println("main end");


	}
}
/*
if system .exit is there then it will not look for finally
whenever system.exit is excuting it is coming away wihout looking for anything
it just like a cntl+c to terminate the flow.

*/