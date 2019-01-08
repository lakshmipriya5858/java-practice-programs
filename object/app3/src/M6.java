class  A
{
	int i;
	int j;
	int k;
	double m;
	A(int i,int j,int k,double m)
	{
	this.i=i;
	this.j=j;
	this.k=k;
	this.m=m;
}
public int hashCode()
{
		String s1=Integer.toString(i);
		String s2=Integer.toString(j);
		String s3=Integer.toString(k);
		String s4=Double.toString(m);
		int hash=s1.hashCode();
		hash +=s2.hashCode();
		hash +=s3.hashCode();
		hash +=s4.hashCode();
		return hash;
	}
}
class M6
{
	public static void main(String[] args) 
	{
		A a1=new A(90,80,70,100.8);
		A a2=new A(90,80,70,100.8);
		A a3=new A(90,80,170,100.8);
		A a4=new A(90,170,70,100.8);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
	}
}


/*
*************inequality purpose we using hashcode 
**IMP*****use equals we can 2 objs hashcode is same ,doesnt required if different ,takes more time ,Expensive operation 
if both objects are same and unable to confirm then use equals 
E:\oct-23\object\app3\src>javac -d ..\classes M6.java

E:\oct-23\object\app3\src>java -cp ..\classes M6

E:\oct-23\object\app3\src>java -cp ..\classes M6
46735459
46735459
46782548
46782517*/