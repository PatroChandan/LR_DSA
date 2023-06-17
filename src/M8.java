class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
	}
}
class LinkedList
{
	Node first;
	Node last;
	public void add(int data)
	{
		Node node = new Node(data);
		if(first == null)
		{
			first = node;
			last = node;
			return;
		}
		last.next = node;
		last = node;
	}
	public void read()
	{
		Node current = first;
		while(current != null)
		{
			System.out.print(current.data+", ");
			current = current.next;
		}
		System.out.println();
	}
}
class  M8
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.read();
	}
}
