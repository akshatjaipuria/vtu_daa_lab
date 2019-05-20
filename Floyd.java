import java.util.*;
public class Floyd
{
	static int cost[][]=new int[10][10];
	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter the no. of vertices : ");
		int n=sn.nextInt();
		System.out.println("Enter the cost matrix : ");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				cost[i][j]=sn.nextInt();
		floyd(n);
		System.out.println("The distance matrix : ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				System.out.print(cost[i][j]+" ");
			System.out.println();
		}
	}
	public static void floyd(int n)
	{
		for(int k=1;k<=n;k++)
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(cost[i][j]>(cost[i][k]+cost[k][j]))
						cost[i][j]=cost[i][k]+cost[k][j];
	}
} 