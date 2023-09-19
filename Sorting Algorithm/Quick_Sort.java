package practise_sesssion;

import java.util.Scanner;

public class Quick_Sort {
	Scanner in=new Scanner(System.in);
	private int size,a[],i;
	int creatArray()
	{
		System.out.println("Enter the size of an array");
		size=in.nextInt();
		a=new int [size];
		System.out.println("Enter the elements of an array");
		for(i=0;i<size;i++)
		{
			a[i]=in.nextInt();
		}
		return size;
	}
	void quicksort(int start,int end)
	  {
	      int i,j,pivot;
	      i=start; j=end;pivot=start;
	      while(i<j)
	      {
	          while(a[i]<a[pivot])
	              i++;
	          while(a[j]>a[pivot])
	              j--;
	          if(i<j)
	          {
	              int t=a[i];
	              a[i]=a[j];
	              a[j]=t;
	          }
	      }
	      if(i<end)
	          quicksort(i+1,end);
	      if(start<j)
	          quicksort(start,j-1);
	  }

	void print()
	{
		for(i=0;i<size;i++)
			System.out.print(a[i]+"  ");
	}
	public static void main(String[] args) {
		Quick_Sort obj=new Quick_Sort();
		int size=obj.creatArray();
		System.out.println("Unsorted Array is");
		obj.print();
		obj.quicksort(0,size-1);
		System.out.println("\nSorted array is");
		obj.print();
	}
}
