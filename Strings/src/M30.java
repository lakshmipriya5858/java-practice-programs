class M30
{
	public static void main(String[] args) 
	{
			String s1="Lara Tech";
			int i=s1.indexOf(' ');
			String s2=s1.substring(0,i);
			String s3=s1.substring(i+1);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);

}
}
/*

E:\oct-23\Strings\src>java -cp ..\classes M29
Lara Tech
Lara
Tech
*/