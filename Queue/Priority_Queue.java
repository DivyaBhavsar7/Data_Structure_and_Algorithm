package practise;
import java.util.Scanner;

public class Priority_Queue {
	
	    private int q[],front,rear,maxsize,e;
	    Scanner in=new Scanner(System.in);
	    void create_Queue(int size) {
	    	maxsize=size;
	    	q=new int[maxsize];
	    	rear=-1;
	    	front=0;
	    }
	    void Enqueue()
	    {
	    	System.out.println("Enter the element");
	    	e=in.nextInt();
	    	rear++;
	    	q[rear]=e;
	    	for(int i=front;i<rear;i++)
	    	{
	    		for(int j=front;j<rear;j++)
	    		{
	    			if(q[j]>q[j+1])
	    			{
	    				int temp=q[j];
	    			    q[j]=q[j+1];
	    			    q[j+1]=temp;
	    			}
	    		}
	    	}
	    	System.out.println(e+" Enqueued");
	    }
	    void Dequeue()
	    {
	    	System.out.println(q[front]+" dequeued");
	    	front++;
	    }
	    void print_q()
	    {
	    	for(int i=front;i<=rear;i++)
	    		System.out.print(q[i]+"|->");
	    }
	    boolean is_full()
	    {
	    	if(rear==maxsize-1)
	    		return true;
	    	else 
	    		return false;
	    }
	    boolean is_empty()
	    {
	    	if(front>rear)
	    		return true;
	    	else
	    		return false;
	    }
		public static void main(String[] args) {
	    	Scanner in= new Scanner(System.in);
			System.out.println("Enter the size of Queue...");
			int size=in.nextInt();
			Priority_Queue obj=new Priority_Queue();
			obj.create_Queue(size);
			int choice=0;
			do
			{
				System.out.println("Enter the choise...");
				System.out.println("\n1. ENQUEUE\n2. DEQUEUE\n3. PRINT\n0. EXIT");
		        choice=in.nextInt();
				switch(choice)
				{
				case 1: 
					if(obj.is_full()!=true)
					obj.Enqueue();
					else
						System.out.println("Queue is Full...");
				break;
				case 2: 
					if(obj.is_empty()!=true)
					obj.Dequeue();
					else
						System.out.println("Queue Is Empty...");
				break;
				case 3:
					if(obj.is_empty()!=true)
						obj.print_q();
					else
						System.out.println("Queue Is Empty...");
				break;
				case 0 : System.out.println("Exiting...");
				break;
				default:System.out.println("Invalid Choise...");
				break;
				}
			}while(choice!=0);
		}
}
