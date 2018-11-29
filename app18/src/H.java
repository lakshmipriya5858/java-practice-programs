class A
{
   static 
	{
	System.out.println("A.SIB");
     }
	 static void test()
	{
	System.out.println("A.test()");
	 }

}
class  H
{
	static 
	{
	System.out.println("H.SIB");//loaded to the memory and starts main method
	}
	public static void main(String[] args) 
	{
			System.out.println("H.main");
            A.test();           //A is loading to the memory 
			System.out.println("H.main");
	}
}
/*
E:\oct-23\app18\src>java -cp ..\classes H
H.SIB
H.main
A.SIB
A.test()
H.main*/