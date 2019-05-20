import java.util.*;
public class Prims
{
	public static void main(String args[])
	{
		int cost[][]=new int[10][10];
		int vis[]=new int[10];
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter the no. of vertices : ");
		int n=sn.nextInt();
		for(int i=1;i<n;i++)
			vis[i]=0;
		System.out.println("Enter the cost matrix : ");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				cost[i][j]=sn.nextInt();
		System.out.print("Enter the source vertex : ");
		int source=sn.nextInt();
		vis[source]=1;
		int c=1,sum=0;
		while(c<n)
		{
			int min=999;
			int u=0,v=0;
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(vis[i]==1&&vis[j]==0)
						if(i!=j&&cost[i][j]<min)
						{
							min=cost[i][j];
							u=i;
							v=j;
						}
			vis[v]=1;
			c++;
			sum+=min;
			System.out.println(u + "->" + v + "=" + min);
		}
		for(int i=1;i<=n;i++)
			if(vis[i]==0)
			{
				System.out.println("No Spanning tree!!");
				System.exit(0);
			}
		System.out.println("The cost of minimum spanning tree is" + sum);
	}
}