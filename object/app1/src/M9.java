class A 
{

}
class M9
{
	public static void main(String[] args) 
	{
		A a1=null;
		String s1="something "+a1;
		System.out.println(a1);
		System.out.println(s1);
	}
}
//when adding null to string it is not cxalling to string method 
//to avoid nummpointer 
//if ef null it is not calling to string method)