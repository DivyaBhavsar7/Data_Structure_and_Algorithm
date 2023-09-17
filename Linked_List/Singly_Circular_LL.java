package practise;
import java.util.Scanner;

class Node
{
	int data;
	Node next;
	Node (int e)
	{
		data=e;
		next=null;
	}
}
public class SC_LL {
	private int e;
    Node root,last,tos;
    Scanner in=new Scanner(System.in);
    void CreateLL()
    {
    	root=last=null;
    	tos=null;
    }
    void insertLeft()
    {
    	System.out.println("Enter the element..");
    	e=in.nextInt();
    	Node n=new Node(e);
    	if(root==null)
    	{
    		root=last=n;
    		root.next=last;
    	}
    	else
    	{
    		n.next=root;
    		root=n;
    		last.next=root;
    	}
    }
    void insertRight()
    {
    	System.out.println("Enter the element..");
    	e=in.nextInt();
    	Node n=new Node(e);
    	if(root==null)
    	{
    		root=last=n;
    		root.next=last;
    	}
    	else
    	{
    		last.next=n;
    		last=last.next;
    		last.next=root;
    	}
    }
    void deleteLeft()
    {
    	if(root==null)
    		System.out.println("List empty...");
    	else
    	{
    	if(root==last)
    		root=last=null;
    	else
    	{
    		root=root.next;
    		last.next=root;
    	}
    	}
    }
    void deleteRight()
    {
    	if(root==null)
    		System.out.println("List empty...");
    	else
    	{
    	if(root==last)
    		root=last=null;
    	else
    	{
    		Node t=root;
    		while(t.next!=last)
    		    t=t.next;
    		System.out.println(last.data+" is deleted");
    		last=t;
    		last.next=root;
    	}
    	}
    }
    void print()
    {
    	if(root==null)
    		System.out.println("List Empty");
    	else
    	{
    		Node t=root;
    		do
    		{
    			System.out.print(t.data+"|->");
    			t=t.next;
    		}while(t!=root);
    	}
    }
    void revPrint()
    {
    	if(root==null)
    		System.out.println("Empty List...");
    	else
    	{
    		Node t=root;
    		do
    		{
    		    Push(t.data);
    			t=t.next;
    		}while(t!=root);
    		while(tos!=null)
    		{
    			System.out.print(Pop()+"|->");
    		}
    	}
    }
    void Push(int e)
    {
        Node n=new Node(e);
        if(tos==null)
           tos=n;//only for 1st
        else
        {
            n.next=tos;//1
            tos=n;//2
        }
    }
    int Pop()
    {
    	Node t=tos;
        tos=tos.next;
        return t.data;
    }
    int searchList(int e)
    {   if(root==null)
        {
    	     System.out.println("Empty list");
             return 0; 
        }
        else
        {   
        	Node t=root;
            do
            {
            	if(t.data==e)
				{
					return 1;
				}
            	t=t.next;
            }while(t!=root && t.data!=e);
            if(t==root)
                return 0;
            else
                return 1;
        }
    }
    void deletespecific(int ele) {
  	  if(root==null)
  		  System.out.println("list is Empty..");
  	  else 
  	  {
  		  Node t =root;
  		  Node t2=root;
  		  while(t.next!=root && t.data!=ele)
  		  {
  			  t2=t;
  			  t=t.next;  
  		  }
  		  if(t==root) {
  			  System.out.println("Not Found..");
  		  }
  		  else
  		  {
  			  if(t2==root) 
  			  {
  				  root=root.next;
  				  last.next=root;
  			  }
  			  else if(t.next==root)
  			  {
  				  t2.next=root;
  			  }
  			  else {
  				  t2.next=t.next;
  			  }
  			  System.out.println(t.data+" deleted");
  		  }
  		  
  	  }
    }
    void insertat(int ele,int index)
    {
    	Node n=new Node(ele);
		  if(root==null)
		  {
			  if(index==0)
			  {
				  root=last=n;
				  last.next=root;
			  }
			  else
			     System.out.println("Index out of bound...");
		  }
  	  else 
  	  {
  	      if(index==0)
  	      {
  		      n.next=root;
  		      root=n;
  		      last.next=root;
  	      }
  	       else 
  	       {
  	    	   Node t=root;
  	    	   Node t2=root;
  	    	   do
  	    	   {
  	    		   index--;
  	    		   t2=t;
  	    		   t=t.next;
  	    	   }while(t!=root && index>1);
  	    	   if(t==root)
  	    		   System.out.println("Index out of bound");
  	    	   else 
  	    	   {
  	    		  n.next=t;
  	    		  t2.next=n;
  	    	   }
  	       }
        }
    }
	public static void main(String[] args) {
		int ch,e;
        SC_LL obj=new SC_LL();
        Scanner in=new Scanner(System.in);
        obj.CreateLL();//root null
        do
        {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print all\n6.Reverse Print\n7.Search\n8.delete specific\n9.insert at\n0.Exit\n:");
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
                    int res=obj.searchList(e);
                    if(res==1)
                    	System.out.println("Key Found");
                    else
                    	System.out.println("Key Not Found");
                    break;
                case 8:
                	System.out.println("Enter element..");
                        e=in.nextInt();
                        obj.deletespecific(e);
                    break;
                case 9:
                	System.out.println("Enter the element");
                	e=in.nextInt();
                	System.out.println("enter index");
                	int index=in.nextInt();
                	obj.insertat(e, index-1);
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
