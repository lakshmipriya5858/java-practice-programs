class Z20
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		String i=test();
		System.out.println("main end!");
	}
	public static String test()
	{
				System.out.println("from test!");
				return "hello";
	}
}
/*main begin!
from test!
main end!*/