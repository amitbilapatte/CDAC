package list;

class BT1
{
	Node root;
	static class Node
	{
		int data;
		Node left, right;
		
		Node(int d)
		{
		key = d;
		left = right = null;
		
		}
	}
	BT1()
	{
		root = null;
	}
	BT1(int d)
	{
		root = new Node(d);
	}
	public static void main()
	{
		BT1 t1 = new BT1();
		t1.root = new Node(11);
		t1.root.left = new Node(22);
		t1.root.right = new Node(33);
		t1.root.left.left = new Node(44);
	}
}
