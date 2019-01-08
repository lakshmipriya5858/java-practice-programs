class A 
{
	int i;
	int j;
	A(int i,int j)	
	{
	this.i = i;
	this.j = j;
	}
		
	public boolean equals(Object obj)
	{
	return (i==((A)obj).i && j==((A)obj).j);
	}
}
class B
{
	int m;
	int n;
	A element;
	String s1;
	B(int m,int n)	
	{
	this.m=m;//not assigning element
	this.n=n;
	}
	public boolean equals(Object obj)
	{
	boolean status =(obj instanceof B) &&
		(element==null ? (((B)obj).element==null ? true : false):
		(((B)obj).element ==null ? false:
						element.equals(((B)obj).element))) &&
	(m==((B)obj).m &&n==((B)obj).n);
	return status; 
	}
}
	class M10
	{
			public static void main(String[] args) 
			{
			A a1=new A(90,500);
			A a2=new A(90,500);
			System.out.println(a1.equals(a2));	
			B b1=new B(30,50);
			B b2=new B(30,50);
			B b3=new B(30,50);
			b2.element=a2;
			System.out.println(b1.equals(a1));	
			System.out.println(b1.equals(10.8));	
			System.out.println(b2.equals(new Thread()));	
			System.out.println(b2.equals("abc"));				
			}
		}
/*
E:\oct-23\object\app2\src>javac -d ..\classes M10.java

E:\oct-23\object\app2\src>java -cp ..\classes M10
true
false
false
false
false
*/