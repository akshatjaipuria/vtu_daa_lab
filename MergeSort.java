package ext;
import java.util.*;

public class MergeSort {
	
	static void mergesort(int a[],int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid = (low+high)/2;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			merge(a,low,mid,high);
			
		}
	}
	
	static void merge(int a[],int low,int mid,int high)
	{
		int i=low,j=mid+1,k=low;
		int c[] = new int[5000];
		
		while(i<=mid && j<=high)
		{
			if(a[i]<=a[j])
			{
				c[k] = a[i];
				i++;
			}
			else
			{
				c[k] = a[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid)
		{
			c[k] = a[i];
			i++;
			k++;
		}
		
		while(j<=high)
		{
			c[k] = a[j];
			k++;
			j++;
		}
		
		for(i=low;i<=high;i++)
		{
			a[i] = c[i];
		}
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of elements");
		int n = in.nextInt();
		Random rand = new Random();
		int a[] = new int[5000];
		
		for(int i=0;i<n;i++)
		{
			a[i] = rand.nextInt(100);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		long start_time = System.nanoTime();
		mergesort(a,0,n-1);
		long end_time = System.nanoTime();
		long t = end_time-start_time;
		System.out.println("after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("time taken =" + t);

	}
}





























