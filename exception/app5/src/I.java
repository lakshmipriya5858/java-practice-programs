class I 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try(H h1=new H();
		      H h2=new H())//jdk 1.7 
		{
		System.out.println("from try ");
		}
		catch(Exception ex)
		{
		System.out.println(ex);
		}
		finally
		{
			System.out.println("from finally");	
		}
				System.out.println("main end ");

	}
}
//close method is auto closing before finally block
//noe=w finally has become optionAL
//all those resources are closing automatically
//whenever try exceution is getting over 
//we dont need to close it explicitly the finally block
//h1 nad h2 local to drive 