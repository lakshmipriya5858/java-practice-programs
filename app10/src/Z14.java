class Z14
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=0;i<=5;i++)
		{
					System.out.println("loop1 begin");
					for(int j=0;j<=13;j++)
			        {		
						System.out.println("loop2 begin "+i+","+j);
			         	System.out.println("loop2 end "+i+","+j);
					}
					System.out.println("loop end");
        }
				System.out.println("main end");
	}
}
