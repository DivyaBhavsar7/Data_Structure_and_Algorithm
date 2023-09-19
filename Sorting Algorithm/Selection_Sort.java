package practise_sesssion;
import java.util.Scanner;
public class Selection_Sort {
    int size,i,a[],pos,min,j;
    Scanner in=new Scanner(System.in);
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
	void Selection_Sorting()
	{
		for(i=0;i<size;i++)
		{
			min=a[i];
			pos=i;
			for(j=i+1;j<size;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					pos=j;
				}
			}
			a[pos]=a[i];
			a[i]=min;
		}
	}
	void print()
	{
		for(i=0;i<size;i++)
			System.out.print(a[i]+"  ");
	}
	public static void main(String[] args) {
		Selection_Sort obj=new Selection_Sort();
		obj.creatArray();
		System.out.println("Unsorted Array is");
		obj.print();
		obj.Selection_Sorting();
		System.out.println("\nSorted array is");
		obj.print();
	}
}
