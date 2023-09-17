package practise;
import java.util.Scanner;
public class Dynamic_Stack {
	private int e;
	Node tos;
	Scanner in=new Scanner(System.in);
	Dynamic_Stack()
	{
		tos=null;
	}
	void push()
	{
		System.out.println("Enter the Element");
		e=in.nextInt();
		Node n=new Node(e);
		if(tos==null)
		   tos=n;
		else
		{
			n.next=tos;
			tos=n;
			System.out.println("Pushed");
		}
	}
	void pop()
	{
		if(tos==null)
			System.out.println("Stack Empty...");
		else
		{
			Node t=tos;
			tos=tos.next;
			System.out.println(t.data+" is popped");
		}
	}
	void peek()
	{
		if(tos==null)
			System.out.println("Stack Empty");
		else
			System.out.println(tos.data+" is Peek");
	}
	void print()
	{
		if(tos==null)
			System.out.println("Stack Empty");
		else
		{
			Node t=tos;
			while(t!=null)
			{
				System.out.println(t.data);
				t=t.next;
			}
		}
	}
	public static void main(String args[]) {
		 int ch,e,size;
		Dynamic_Stack obj=new Dynamic_Stack();
		Scanner in=new Scanner(System.in);
        do
        {
           System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
           ch=in.nextInt();
           switch(ch)
           {
               case 1:
                           
                           obj.push();
                           break;
                case 2:
                          obj.pop();
                       break;
                case 3:
                       obj.peek();
                       break;
                case 4:
                       obj.print();
                       
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
