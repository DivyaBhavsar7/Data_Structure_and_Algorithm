package practise_sesssion;
import java.util.Scanner;
public class Bubble_Sort {

	Scanner in=new Scanner(System.in);
	private int size,a[],i,j,t;
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
	void Bubble_Sorting()
	{
		for(i=0;i<size-1;i++)
		{
			for(j=0;j<size-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
	void print()
	{
		for(i=0;i<size;i++)
			System.out.print(a[i]+"  ");
	}
	public static void main(String[] args) {
		Bubble_Sort obj=new Bubble_Sort();
		obj.creatArray();
		System.out.println("Unsorted Array is");
		obj.print();
		obj.Bubble_Sorting();
		System.out.println("\nSorted array is");
		obj.print();

	}

}
