class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		int i=test1();
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
		int j=test2();
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
		System.out.println(test1());
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
		System.out.println(test2());
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
		System.out.println("main end!"+i+j);
	}
	public static int test1()
	{
		System.out.println("test1!");
		return test2();
}
public static int test2()
	{
		System.out.println("test2");
		return 50;
}
}