class D
{
	static int i=10, j ,k=0;
		public static void main(String[] args) 
	{
		System.out.println(i+","+j+","+k);
		i=1;
		j=2;
		k=3;
		System.out.println(i+","+j+","+k);

	}
}
/*output:
10,0,0
1,2,3*/