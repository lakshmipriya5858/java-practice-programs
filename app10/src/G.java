class G
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		for(int i=1 ; i<=5 ; i++)
		{		
			System.out.println("loop body!"+ i); 
		}

		System.out.println("main end"+i);//i cannot be used as it is local variable

	}
}
