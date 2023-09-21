package practise_tree_graph;
class Node
{
	int data;
	Node left,right;
	Node(int e)
	{
		data=e;
		right=left=null;
	}
}
public class Tree {
	
	private Node root;
	static int c=0,c1=0;
	Tree()
	{
		root=null;
	}
	void tree(Node r,Node n)
	{
		if(root==null)
			root=n;
		else
		{
			if(r.data>n.data)
				if(r.left==null)
					r.left=n;
				else
					tree(r.left, n);
			else
			{
				if(r.right==null)
					r.right=n;
				else
					tree(r.right,n);
			}
		}
	}
	void inorder(Node r) {
		if(r!=null)
		{
			inorder(r.left);
			System.out.print(r.data+"  ");
			inorder(r.right);
		}
	}	
	public static void main(String[] args) {
		
		Tree t=new Tree();
		
		Node n1=new Node(86);
		Node n2=new Node(56);
		Node n3=new Node(78);
		Node n4=new Node(103);
		Node n5=new Node(42);
		
		t.tree(t.root, n1);
		t.tree(t.root, n2);
		t.tree(t.root, n3);
		t.tree(t.root, n4);
		t.tree(t.root, n5);
    
	    System.out.println("\nInorder");
	    t.inorder(t.root);
		}
}
