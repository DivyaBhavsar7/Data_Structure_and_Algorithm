
package practise;

import java.util.Scanner;
class Dnode
{
	int data;
	Dnode left;
	Dnode right;
	Dnode(int e)
	{
		data=e;
		left=null;
		right=null;
	}
}
public class DC_LL {
	private int e;
	Dnode root,last;
	Scanner in=new Scanner(System.in);
	void createList()
	{
		root=last=null;
	}
	void insertLeft()
	{
		System.out.println("Enter the Element");
		e=in.nextInt();
		Dnode n=new Dnode(e);
		if(root==null)
		{
			root=last=n;
			root.left=last;
			last.right=root;
		}
		else
		{
			n.right=root;
			n.left=last;
			root.left=n;
			last.right=n;
			root=root.left;
		}
	}
	void insertRight()
	{
		System.out.println("Enter the Element");
		e=in.nextInt();
		Dnode n=new Dnode(e);
		if(root==null)
		{
			root=last=n;
		}
		else
		{
			n.left=last;
			n.right=root;
			last.right=n;
			root.left=n;
			last=last.right;
		}
	}
	void deleteLeft()
	{
		if(root==null)
			System.out.println("List Empty...");
		else
		{
			Dnode t=root;
			root=root.right;
			root.left=last;
			last.right=root;
			System.out.println(t.data+" deleted");
		}
	}
	void deleteRight()
	{
		if(root==null)
			System.out.println("List Empty...");
		else
		{
			Dnode t=last;
			last=last.left;
			last.right=root;
			root.left=last;
			System.out.println(t.data+" deleted");
		}
	}
	void print()
	{
		if(root==null)
			System.out.println("List Empty...");
		else
		{
			Dnode t=root;
			do
			{
				System.out.print(t.data+"|->");
				t=t.right;
			}while(t!=root);
		}
	}
	void revPrint()
	{
		if(root==null)
			System.out.println("List Empty...");
		else
		{
			Dnode t=last;
			do
			{
				System.out.print(t.data+"|->");
				t=t.left;
			}while(t!=last);
		}
	}
	int findkey(int e)
	{
		if(root==null)
		{	
			System.out.println("List Empty...");
		    return 0;
		}
        else
		{
			Dnode t=root;
			do
			{
				if(t.data==e)
				{
					return 1;
				}
				t=t.right;
				
			}while(t!=root && t.data!=e);
			if(t==root)
				return 0;
			else 
				return 1;    
		}
	}
	public static void main(String[] args) {
		int ch,e;
        DC_LL obj=new DC_LL();
        Scanner in=new Scanner(System.in);
        obj.createList();//root null
        do
        {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print all\n6.print Reverse\n7. Search Key\n0.Exit\n:");
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
                       obj.deleteLeft();
                       break;
                case 4:
                      obj.deleteRight();
                       break;  
                case 5:
                    obj.print();
                    break;
                case 6:
                	obj.revPrint();
                	break;
                case 7:
                    System.out.println("Enter element:");
                    e=in.nextInt();
                    int res=obj.findkey(e);
                    if(res==1)
                    	System.out.println("Key Found");
                    else
                    	System.out.println("Key Not Found");
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
