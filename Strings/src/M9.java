class M9
{
	public static void main(String[] args) 
	{
		String s1;
		int i=s1.length();
		System.out.println(i);
	}
}
/*
E:\oct-23\Strings\src>javac -d ..\classes M9.java
M9.java:6: error: variable s1 might not have been initialized
                int i=s1.length();
                      ^
1 error
*/