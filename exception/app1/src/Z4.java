import java.util.Scanner;// JDK1.5
class Z4
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
		System.out.println("enter something");
		String s1= sc.next();
		try
		{
		System.out.println(1);
		int i = Integer.parseInt(s1); 
		System.out.println(2);
		int k = i/ (i-9);
		System.out.println(3);
		}
		catch ( ArithmeticException ex) 
		{
		  System.out.println(4);
		}
		catch (NumberFormatException ex) 
		{
		  System.out.println(5);
		}
		
		System.out.println("main end");


	}
}
/*
u can input special char abc .
one try can have many catches.
every catcth should have different exception(argument) else cte.
if one catcth is executing other catcth will not execute.
if there is no exception catch will not excute.

*/