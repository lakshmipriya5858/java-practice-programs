class  Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1,j=10;
		for(i=5,System.out.println("init end"),j=20;//any type & no of statements are used 
		     test(i,j); 
		i+=2,System.out.println("changes"),j+=5)
		{
		System.out.println("loop body"+i+","+j);
		}
		System.out.println("main end");
	}
static boolean test(int i,int j)
	{
	boolean b1=i<=15&&j<=50;
		System.out.println("boolean test "+i+"and"+j+"is"+b1);
		return b1;

}
}
