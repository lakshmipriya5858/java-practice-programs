class Z19
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1;i<=5;i++)
					System.out.println("loop1 body stmt 1"+i);//Only one stmt will bwe a part of for loop
					System.out.println("loop1 body stmt 2"+i);//ERROR
					System.out.println("main begin");
		
	}
}
