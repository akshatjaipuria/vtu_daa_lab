import java.util.*;
public class mergesort
{
	static int max=50000;
	public static void merge(int a[],int low,int mid,int high)
	{
		int i=low;
		int j=mid+1;
		int k=low;
		int c[]=new int[20000];
		while((i<=mid)&&(j<=high))
		{
			if(a[i]<=a[j])
				c[k]=a[i++];
			else
				c[k]=a[j++];
			k++;
		}
		while(i<=mid)
			c[k++]=a[i++];
		while(j<=high)
			c[k++]=a[j++];
		for(i=low;i<=high;i++)
			a[i]=c[i];
	}
	public static void ms(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			ms(a,low,mid);
			ms(a,mid+1,high);
			merge(a,low,mid,high);
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
			ms(arr,0,n-1);
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