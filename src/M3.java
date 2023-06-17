class C
{
	int data;
	C ref;
	C(int data)
	{
		this.data = data;
	}
}
class  M3
{
	public static void main(String[] args) 
	{
		C c1 = new C(90);
		C c2 = new C(10);
		C c3 = new C(30);
		C c4 = new C(20);
		c1.ref = c2;
		c2.ref = c3;
		c3.ref = c4;
		System.out.println(c1.data);//90
		System.out.println(c1.ref.data);//10
		System.out.println(c1.ref.ref.data);//30
		System.out.println(c1.ref.ref.ref.data);//20
	}
}
