class A 
{
	int i;
	int j;
	A(int i,int j)	
	{
	this.i=i;
	this.j=j;
	}
	public String toString()
	{
		return "(i="+ i + ",j="+ j+")";
	}
}
class B extends A
{
	int m;
	int n;
	B(int i,int j ,int m,int n)	
	{
	super(i,j);
	this.m=m;
	this.n=n;
	}
	public String toString()
	{
		return super.toString() + ",m="+ m + ",n="+ n+")";
	}
}
	class M7
	{
		public static void main(String[] args) 
		{
			A a1=new A(10,20);
			A a2=new A(100,200);
			String s1="state of a1"+a1;
			String s2="state of a2"+a2;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(s1);
		System.out.println(s2);
		
			B b1=new B(10,20,40,50);
			B b2=new B(100,200,20,50);
			String s3="state of a1"+b1;
			String s4="state of a2"+b2;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s3);
		System.out.println(s4);
		}
	}
/*
overriding to string method of subclass

E:\oct-23\object\src>java -cp ..\classes M7
(i=10,j=20)
(i=100,j=200)
state of a1(i=10,j=20)
state of a2(i=100,j=200)
(i=10,j=20),m=40,n=50)
(i=100,j=200),m=20,n=50)
state of a1(i=10,j=20),m=40,n=50)
state of a2(i=100,j=200),m=20,n=50)

*/