package ext;
import java.util.*;
public class QuickSort {
	
	static void quicksort(int a[],int low,int high)
	{
		int m;
		if(low<high)
		{
			m = partition(a,low,high);
			quicksort(a,low,m-1);
			quicksort(a,m+1,high);
		}
	}
	
	static int partition(int a[],int low,int high)
	{
		int i=low-1,temp;
		int pivot = a[high];
		
		for(int j=low;j<high;j++)
		{
			if(a[j] <= pivot)
			{
				i++;
				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		
		return i+1;
	}
	
	public static void main(String args[])
	{
		int a[] = new int[5000];
		Scanner in = new Scanner(System.in);
		System.out.println("enter no. of elements");
		int n = in.nextInt();
		Random rand = new Random();
		for(int i = 0;i<n;i++)
		{
			a[i] = rand.nextInt(100);
		}
		
		for(int i = 0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		long start_time = System.nanoTime();
		quicksort(a,0,n-1);
		long end_time = System.nanoTime();
		long t = end_time - start_time;
		System.out.println("after sorting");
		for(int i = 0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("time taken ="+ t);
	}
}












