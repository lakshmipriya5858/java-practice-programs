package pack1;
class F 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i = 10;
		assert i == 10 : ;// after colon there shd be somthing v hv supply 
		System.out.println(2);
	}
}
//CTE
/*
pack1\F.java:8: error: illegal start of expression
                assert i == 10 : ;
                                 ^
1 error
*/