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
	class M11
	{
			public static void main(String[] args) 
			{
			String  s1="hello";
			String  s2="hello";
			String  s3=new String("hello");
			String  s4=new String("hello");
			System.out.println(s1.equals(s2));				
			System.out.println(s1.equals(s3));				
			System.out.println(s1.equals(s4));				
			System.out.println(s2.equals(s3));				
			System.out.println(s2.equals(s4));				
			System.out.println(s3.equals(s4));				
			}
		}
/*
E:\oct-23\object\app2\src>javac -d ..\classes M11.java


E:\oct-23\object\app2\src>java -cp ..\classes M11
true
true
true
true
true
true
*/