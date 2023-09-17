package practise;

import java.util.Scanner;

public class Circular_Queue {
	Scanner in= new Scanner(System.in);
	private int q[],front,rear,maxsize,e,c=0;
	void create_queue(int size)
	{
		front=0;
		rear=-1;
		maxsize=size;
		q=new int[maxsize];
	}
	void enqueue()
	{
		System.out.println("Enter the element");
		e=in.nextInt();
		rear=(rear+1)%maxsize;
		q[rear]=e;
		System.out.println(q[rear]+" is Enqueued");
		c++;
	}
	void dequeue()
	{
		System.out.println(q[front]+" is Dequeued");
		front=(front+1)%maxsize;
		c--;
	}
	void print()
	{
	    int f=front;
		for(int i=1;i<=c;i++)
		{
	     	System.out.print(q[f]+"|->");
	     	f=(f+1)%maxsize;
		}
	}
	boolean is_full()
	{
		if(c==maxsize)
			return true;
		else
			return false;
	}
	boolean is_empty()
	{
		if(c==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the size of Queue...");
		int size=in.nextInt();
		Circular_Queue obj=new Circular_Queue();
		obj.create_queue(size);
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
				obj.enqueue();
				else
					System.out.println("Queue is Full...");
			break;
			case 2: 
				if(obj.is_empty()!=true)
				obj.dequeue();
				else
					System.out.println("Queue Is Empty...");
			break;
			case 3:
				if(obj.is_empty()!=true)
					obj.print();
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
