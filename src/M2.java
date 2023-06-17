class B
{
	int data;
	B(int data)
	{
		this.data = data;
	}
}
class  M2
{
	public static void main(String[] args) 
	{
		B b1 = new B(10);
		B b2 = new B(20);
		B b3 = new B(30);
		B b4 = new B(40);
		B b5 = new B(50);
		B b6 = new B(60);
		System.out.println(b1.data);
		System.out.println(b2.data);
		System.out.println(b3.data);
		System.out.println(b4.data);
		System.out.println(b5.data);
		System.out.println(b6.data);
	}
}
