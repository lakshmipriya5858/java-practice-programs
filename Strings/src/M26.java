class M26
{
	public static void main(String[] args) 
	{
			String s1=new String("hellohello");
			System.out.println(s1);
			int i=s1.indexOf('e');
			System.out.println(i);
			 i=s1.lastIndexOf('l');
			System.out.println(i);
			 i=s1.lastIndexOf('H');
			System.out.println(i);

}
}
/*

E:\oct-23\Strings\src>java -cp ..\classes M26
hellohello
1
8
-1
*/