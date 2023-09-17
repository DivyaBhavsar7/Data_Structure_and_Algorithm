package practise;
import java.util.Scanner;

public class Dynamic_Queue {
    Node rear,front;
    Scanner in=new Scanner(System.in);
    Dynamic_Queue()
    {
    	front=rear=null;
    }
    void enqueue()
    {
    	System.out.println("Enter the element");
    	int e=in.nextInt();
    	Node n=new Node(e);
    	if(rear==null)
    		rear=front=n;
    	else
    	{
    		rear.next=n;
    		rear=n;
    		System.out.println("Enqueued...");
    	}
    }
    void dequeue()
    {
    	if(rear==null|| front==null)
    		System.out.println("Queue Empty...");
    	else
    	{
    		Node t=front;
    		if(front==rear)
    		{
    			front=rear=null;
    			System.out.println(t.data+" dequeued...");
    		}
    		else
    		{
    		front=front.next;
    		System.out.println(t.data+" dequeued...");
    		}
    	}
    }
    void print()
    {
    	if(rear==null)
    		System.out.println("Queue Empty...");
    	else
    	{
    		Node t=front;
    		while(t!=null)
    		{
    			System.out.print(t.data+"|->");
    			t=t.next;
    		}
	        System.out.println();
    	}
    }
    public static void main(String[] args) {
   
    	int ch,e;
        Dynamic_Queue obj=new Dynamic_Queue();
        Scanner in= new Scanner(System.in);
    	do {
    		System.out.println("\n1. Enqueue\n2. Dequeue\n3.Print\n0. EXIT");
    		ch=in.nextInt();
    		switch(ch)
    		{
    		case 1:
    		        obj.enqueue();
    			break;
    		case 2:
    			    obj.dequeue();
    			break;
    		case 3: 
    				obj.print();
    			break;
    		case 0 : System.out.println("Exiting...");
    		break;
    		default: System.out.println("Invalid choise");
    		}
    		}while(ch!=0);
	}
}
