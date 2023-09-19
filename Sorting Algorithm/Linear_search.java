package practise_sesssion;

import java.util.Scanner;

public class Linear_search {
	Scanner in=new Scanner(System.in);
    private int a[],size,value,i;
	Linear_search()
	{
		System.out.println("enter the size of an array");
		size=in.nextInt();
		a=new int[size];
		System.out.println("Enter the elements of an array...");
		for(i=0;i<size;i++)
			a[i]=in.nextInt();
	}
	int search()
	{
		System.out.println("Enter the key value..");
		value=in.nextInt();
		for(i=0;i<size;i++)
		    if(a[i]==value)
				return i+1;
		return -1; 
	}
    public static void main(String args[]) {
    	Linear_search obj=new Linear_search();
    	int result=obj.search();
    	if(result!=-1)
    		System.out.println("value is found at "+result+" position");
    	else
    		System.out.println("value is not found");
    }
}
