class M4
{
	public static void main(String[] args) 
	{
		Boolean flag = false;
		Boolean b1 = new Boolean(flag);
		Boolean b2 = Boolean.valueOf(flag);
		boolean i = b1.booleanValue();
		boolean j = b2.booleanValue();
		System.out.println("Hell");
	}
}
//boolean primitive boxing into object and then unboxing.