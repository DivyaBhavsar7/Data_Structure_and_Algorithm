package practise;
import java.util.Scanner;
class Node
{
	int data;
	Node next;
	Node(int e)
	{
		data=e;
		next=null;
	}
}
public class SL_LL {
    Node root;
    int e;
    Scanner in=new Scanner(System.in);
	void createLL()
	{
		root=null;
	}
	void insertLeft()
	{
		System.out.println("Enter the element");
		e=in.nextInt();
		Node n=new Node(e);
		if(root==null)
			root=n;
		else
		{
			n.next=root;
			root=n;
			System.out.println(e+" inserted at left");
		}
	}
	void insertRight()
	{
		System.out.println("Enter the element");
		e=in.nextInt();
		Node n=new Node(e);
		if(root==null)
			root=n;
		else
		{
			Node t=root;
			while(t.next!=null)
			{
			    t=t.next;
			}
			t.next=n;
	   }
	}
	void deletLeft()
	{
		if(root==null)
			System.out.println("List is Empty");
		else
		{
			Node t=root;
			root=root.next;
			System.out.println(t.data+" deleted...");
		}
	}
	void deletRight()
	{
		if(root==null)
			System.out.println("List is Empty");
		else
		{
			Node t=root;
			Node t2=root;
			while(t.next!=null)
			{
				t2=t;
				t=t.next;
			}
			t2.next=null;
		}
	}
	void print()
	{
		if(root==null)
			System.out.println("List is Empty");
		else
		{
			Node t=root;
			while(t!=null)
			{
				System.out.print(t.data+" |->");
				t=t.next;
			}
		}
	}
	int findKey(int key)
	{
		if(root==null)
		{
			System.out.println("List is Empty");
			return 0;
		}
		else
		{
			Node t=root;
			while(t!=null)
			{
			if(t.data==key)
			{
				return 1;
			}
			else
               t=t.next;			
			}
			return 0;
		}
	}
	void insertAt(int e,int index)
	{
		if(root==null)
			System.out.println("List Empty...");
		else
		{
		    Node n=new Node(e);
		    if(index==0)
		    {
			    n.next=root;
			    root=n;
		    }
		    else
		    {
		    	Node t=root;
		    	while(t!=null && index>1)
		    	{
		    		t=t.next;
		    		index--;
		    	}
		    	if(t==null)
		    		System.out.println("Index Out Of Bound...");
		    	else
		    	{
		    		n.next=t.next;
		    		t.next=n;
		    	}
		    }
		}
    }
	void deleteSpecific(int e)
	{
		if(root==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			Node t=root;
			Node t2=root;
			while(t!=null && t.data!=e)
			{
				t2=t;
			    t=t.next;  
			}
			if(t==null)
				System.out.println("Element not found");
			else
			{
				if(t==root)
					
					root=root.next;
				else if(t.next==null)
					t2.next=null;
				else
				    t2.next=t.next;
				System.out.println(t.data+" is Deleted");
			}
		} 
	}
	public static void main(String[] args) {
		int ch,e;
        SL_LL obj=new SL_LL();
        Scanner in=new Scanner(System.in);
        obj.createLL();//root null
        do
        {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print all\n6.Search\n7.delete specific\n8.insert at\n0.Exit\n:");
           ch=in.nextInt();
           switch(ch)
           {
               case 1:
                       obj.insertLeft();
                       break;
                case 2:
                       obj.insertRight();
                       break;
                case 3:
                       obj.deletLeft();
                       break;
                case 4:
                      obj.deletRight();
                       break;  
                case 5:
                    obj.print();
                    break;
                case 6:
                    System.out.println("Enter element:");
                    e=in.nextInt();
                    int res=obj.findKey(e);
                    if(res==1)
                    	System.out.println("Key Found");
                    else
                    	System.out.println("Key Not Found");
                    break;
                case 7:System.out.println("Enter element..");
                        e=in.nextInt();
                        obj.deleteSpecific(e);
                        
                	break;
                case 8:
                	System.out.println("Enter the element");
                	e=in.nextInt();
                	System.out.println("enter index");
                	int index=in.nextInt();
                	obj.insertAt(e, index-1);
                	break;
                default:
                    System.out.println("Wrong option");
                    break;
                case 0:
                    System.out.println("Exiting ");
                    break;
           }//switch         
           }while(ch!=0);
	}
}
