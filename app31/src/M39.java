class M39
{
	public static void test(Integer b1)
	{
				System.out.println("Ineger");
	}
	
	public static void test(byte ... b1)
	{
				System.out.println("byte ...");
	}


	public static void main(String[] args) 
	{
		byte b1=10;
		test(b1);
	}
}
//byte ...
// last prefernce goes to var arg
// 1) widening
//2) boxing then upcassting
//3)var arg.