class Z12	 
{
	public static void main(String[] args) 
	{
    System.out.println("main begin World!");
	for(int i=1;i<=5;i++)
		{ 		
		System.out.println("loop body:"+i);
	    if(i==3)
			{
			continue;
			break;
		
	        }
		System.out.println("loop end:"+i);
	    }
		System.out.println("main end ");

	}
}
