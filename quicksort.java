import java.util.*;
public class quicksort
{
	static int max=50000;
	public static int partition(int a[],int low,int high)
	{
		int key=a[low];
		int i=low;
		int j=high+1;
		while(i<=j)
		{
			do
			{
				i++;
			}
			while(key>=a[i]&&i<=high);
			do
			{
				j--;
			}
			while(key<a[j]);
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[low];
		a[low]=a[j];
		a[j]=temp;
		return j;
	}
	public static void qs(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid=partition(a,low,high);
			qs(a,low,mid-1);
			qs(a,mid+1,high);
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=s.nextInt();
		Random r=new Random();
		int arr[]=new int[max];
		try
		{
			for(int i=0;i<n;i++)
				arr[i]=r.nextInt(100);
			System.out.println("The random elements are : ");
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
			long start_time=System.nanoTime();
			qs(arr,0,n-1);
			long end_time=System.nanoTime();
			long total_time=end_time-start_time;
			System.out.println("\nElements after sorting : ");
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
			System.out.println("\nExecution time : "+total_time+" nanoseconds");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array Index reached maximum");
		}
	}
}