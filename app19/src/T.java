class  T
{
	int i;
	static  T test()
	{
		T t1=new T();
		t1.i=20;
		return t1;
	}
	public static void main(String[] args) 
	{
				T obj=test();

		System.out.println(obj.i);
	}
}
//20
//method returntype can be any derived type
//T is class type -derived type
//internally t1 pointing obj	