class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
					System.out.println(1);
					String s1 = null;
					int i = s1.length();
					System.out.println(2);

		}
		catch ( NullPointerException ex) // throwable
		{
               ex.printStackTrace();
		}
				System.out.println("main end");


	}
}
/*


*/