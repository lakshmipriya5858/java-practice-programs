class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
					int i=10;
		if(i++==10 || i++==10)		
		{ 
		System.out.println("from if "+ i++);//11
		System.out.println("from if ");
		System.out.println("from if ");
		System.out.println("from if ");
		System.out.println("from if ");
		}
	    System.out.println("main end:"+ i);//12
	}
}
