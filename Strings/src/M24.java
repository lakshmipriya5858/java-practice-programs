class M24
{
	public static void main(String[] args) 
	{
			String s1=new String("hellohello");
			System.out.println(s1);
			int i=s1.indexOf('e');
			System.out.println(i);
			 i=s1.indexOf('l');
			System.out.println(i);
			 i=s1.indexOf('p');
			System.out.println(i);

}
}
/*
E:\oct-23\Strings\src>java -cp ..\classes M24
hellohello
1
2
-1
*/