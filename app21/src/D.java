class  D
{
	D()
	{
				System.out.println("D()");
	}
	D(int i)
	{
				this("xyz",30);
				System.out.println("D(int)");
	}
	D(String i,int j)
	{
		System.out.println("D(string,int )");
	}
	public static void main(String[] args) 
	{
		D d1=new D();
		System.out.println("................");
		D d2=new D(20);
		System.out.println("................");
		D d3=new D("hello",20);
		System.out.println("................");
	}
}
/*
E:\oct-23\app21\src>java -cp ..\classes D
D()
................
D(string,int )
D(int)
................
D(string,int )
................

*/