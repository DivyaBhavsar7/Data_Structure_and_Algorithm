package practise_sesssion;

import java.util.Scanner;

public class Insertion_Sort {
	Scanner in=new Scanner(System.in);
	private int size,a[],i,j,ele;
	void creatArray()
	{
		System.out.println("Enter the size of an array");
		size=in.nextInt();
		a=new int [size];
		System.out.println("Enter the elements of an array");
		for(i=0;i<size;i++)
		{
			a[i]=in.nextInt();
		}
	}
	void Insertion_Sorting()
	{
		for(i=0;i<size-1;i++)
		{
			j=i+1;
			ele=a[i+1];
			while(j>0 && a[j-1]>ele)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=ele;
		}
	}
	void print()
	{
		for(i=0;i<size;i++)
			System.out.print(a[i]+"  ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion_Sort obj=new Insertion_Sort();
		obj.creatArray();
		System.out.println("Unsorted Array is");
		obj.print();
		obj.Insertion_Sorting();
		System.out.println("\nSorted array is");
		obj.print();
	}
}
