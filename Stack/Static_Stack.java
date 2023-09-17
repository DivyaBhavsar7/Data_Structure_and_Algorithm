package practise;

import java.util.Scanner;

public class Static_Stack {

	private int maxsize,tos,stack[],e;
	Scanner in=new Scanner(System.in);
	void createstack(int size)
	{
         tos=-1;
         maxsize=size;
         stack=new int[maxsize];
	}
	void push()
	{
		System.out.println("Enter the Element...");
		e=in.nextInt();
		tos++;
		stack[tos]=e;
	}
	void pop()
	{
		System.out.println(stack[tos]+" is poped");
		tos--;
	}
	void peek()
	{
		System.out.println(stack[tos]+" is a peek element");
	}
	boolean is_full()
	{
		if(tos==maxsize-1)
			return true;
		else
			return false;
	}
	boolean is_empty() 
	{
		if(tos==-1)
			return true;
		else
			return false;
	}
	void print()
	{
		for(int i=tos;i>=0;i--)
			System.out.println(stack[i]);
	}
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the size of Stack...");
		int size=in.nextInt();
		Static_Stack obj=new Static_Stack();
		obj.createstack(size);
		int choice=0;
		do
		{
			System.out.println("Enter the choise...");
			System.out.println("1. PUSH\n2. POP\n3. PEEK\n4. PRINT\n0. EXIT");
	        choice=in.nextInt();
			switch(choice)
			{
			case 1: 
				if(obj.is_full()!=true)
				obj.push();
				else
					System.out.println("Stck is Full...");
			break;
			case 2: 
				if(obj.is_empty()!=true)
				obj.pop();
				else
					System.out.println("Stack Is Empty...");
			break;
			case 3: 
				if(obj.is_empty()!=true)
				obj.peek();
				else
					System.out.println("Stack Is Empty...");
			break;
			case 4:
				if(obj.is_empty()!=true)
					obj.print();
				else
					System.out.println("Stack Is Empty...");
			break;
			case 0 : System.out.println("Exiting...");
			break;
			default:System.out.println("Invalid Choise...");
			break;
			}
		}while(choice!=0);
	}
}
