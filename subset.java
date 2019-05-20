import java.util.*;
public class subset
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int x[]=new int[10];
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements in the set : ");
		int n=s.nextInt();
		System.out.println("Enter the elements : ");
		for(int i=1;i<=n;i++)
				a[i]=s.nextInt();
		System.out.print("Enter the desired sum : ");
		int dsum=s.nextInt();
		for(int i=1;i<Math.pow(2,n);i++)
		{
			subset(i,n,x);
			int sum=0;
			for(int j=1;j<=n;j++)
				if(x[j]==1)
					sum+=a[j];
			if(sum==dsum)
			{
				flag=1;
				System.out.print("Subset : {");
				for(int j=1;j<=n;j++)
					if(x[j]==1)
						System.out.print(a[j]+",");
				System.out.println("} = "+sum);
			}
		}
		if(flag==0)
			System.out.println("No such subset found!!");
	}
	public static void subset(int num,int n,int x[])
	{
		for(int i=1;i<=n;i++)
			x[i]=0;
		for(int i=n;num!=0;i--)
		{
			x[i]=num%2;
			num/=2;
		}
	}
}