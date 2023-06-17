class D
{
	int data;
	D ref;
	D(int data)
	{
		this.data = data;
	}
}
class M4 
{
	public static void main(String[] args) 
	{
		D d1 = new D(10);
		D d2 = new D(20);
		D d3 = new D(30);
		D d4 = new D(40);
		D d5 = new D(50);
		D d6 = new D(60);
		D d7 = new D(70);
		D d8 = new D(80);
		d1.ref = d2;
		d2.ref = d3;
		d3.ref = d4;
		d4.ref = d5;
		d5.ref = d6;
		d6.ref = d7;
		d7.ref = d8;
		
		D element = d1;
		while(element != null)
		{
			System.out.println(element.data);
			element = element.ref;
		}
	}
}
