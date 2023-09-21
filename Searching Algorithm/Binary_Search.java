package practise_sesssion;

import java.util.Scanner;

public class Binary_Search {

	Scanner in=new Scanner(System.in);
	private int a[],i,mid;
	void creatArray(int size)
	{
		
		a=new int [size];
		System.out.println("Enter the elements of an array in sorted form");
		for(i=0;i<size;i++)
		{
			a[i]=in.nextInt();
		}
	}
	void Binary_Search_Algo(int start,int end,int key)
	{
		if(start<=end)
		{
		mid=(start+end)/2;
		if(a[mid]==key)
			System.out.println("Key found at "+(mid+1)+" position");
		else if(a[mid]<key)
			Binary_Search_Algo(mid+1, end, key);
		else
			Binary_Search_Algo(start, mid-1, key);
	    }
		else
		   System.out.println("Key Not Found...");
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Binary_Search obj=new Binary_Search();
		System.out.println("Enter the size of an array");
		int size=in.nextInt();
		obj.creatArray(size);
		System.out.println("Enter the Key");
		int key=in.nextInt();
		obj.Binary_Search_Algo(0,size-1,key);
	}
}
