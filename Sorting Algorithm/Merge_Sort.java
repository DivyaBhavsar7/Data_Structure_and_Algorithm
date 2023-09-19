package practise_sesssion;
import java.util.Scanner;

public class Merge_Sort {
	
	Scanner in=new Scanner(System.in);
	private int size,a[],i;
	void creatArray(int size)
	{
		this.size=size;
		a=new int [size];
		System.out.println("Enter the elements of an array");
		for(i=0;i<size;i++)
		{
			a[i]=in.nextInt();
		}
	}
    void mergesort(int start,int end)
    {
       if(start<end)
       {
          int mid=(start+end)/2;
          mergesort(start,mid);
          mergesort(mid+1,end);
          merger(start,mid,end);
       }
    }
    void merger(int start,int mid,int end)
    {
        int temp[]=new int[a.length];
        int i,j,index;
        i=index=start;
        j=mid+1;
        while(i<=mid && j<=end)
        {
            if(a[i]<a[j])
                temp[index++]=a[i++];
            else
                temp[index++]=a[j++];
        }
        while(i<=mid)
            temp[index++]=a[i++];
        while(j<=end)
            temp[index++]=a[j++];
        
        for (i=start;i<=end;i++)
            a[i]=temp[i];
                
     }
	void print()
	{
		for(i=0;i<size;i++)
			System.out.print(a[i]+"  ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge_Sort obj=new Merge_Sort();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=in.nextInt();
		obj.creatArray(size);
		System.out.println("Unsorted Array is");
		obj.print();
		obj.mergesort(0,size-1);
		System.out.println("\nSorted array is");
		obj.print();
	}
}
