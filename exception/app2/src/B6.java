class B6
{
	int test()
	{
		try
		{
			//several statements
			return 20;
		}
		catch (ArithmeticException ex)
		{
return 30;
		}
		return 40;
	}
	}
//14:unreachable statement 