class  A
{
	int i;
	A(int i)
	{
	this.i=i;
	}
}
class M1
{
	public static void main(String[] args) 
	{
		A a1=new A(90);
		A a2=new A(90);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
}
/*E:\oct-23\object\app3\src>javac -d ..\classes M1.java

E:\oct-23\object\app3\src>java -cp ..\classes M1
366712642
1829164700*/
//3rd method it returns integer representation of memory address 