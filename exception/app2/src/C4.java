class  C4
{
	int test()
	{
	try
	{
		//several statement
		return 20;
	}
	catch (ArithmeticException ex)
	{
				return 10;
	}
	finally
	{
	return 40;
	}
	}
}
//compiles success