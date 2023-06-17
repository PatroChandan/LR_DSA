class A
{
	int data;
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.data = 100;
		A a2 = new A();
		a2.data = 200;
		A a3 = new A();
		a3.data = 300;
		System.out.println(a1.data);
		System.out.println(a2.data);
		System.out.println(a3.data);
	}
}
