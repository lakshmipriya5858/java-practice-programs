class  A
{
	int i;
	A(int i)
	{
	this.i=i;
	}
}
class M2
{
	public static void main(String[] args) 
	{
		A a1=new A(90);
		A a2=a1;
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
}
/*E:\oct-23\object\app3\src>javac -d ..\classes M2.java


E:\oct-23\object\app3\src>java -cp ..\classes M2
366712642
366712642*///3rd method it returns integer representation of memory address 