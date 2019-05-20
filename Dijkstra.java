import java.util.*;
public class Dijkstra
{
	static int cost[][]=new int[10][10];
	static int dist[]=new int[10];
	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter the no. of vertices : ");
		int n=sn.nextInt();
		System.out.println("Enter the cost matrix : ");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				cost[i][j]=sn.nextInt();
		System.out.print("Enter the source vertex : ");
		int source=sn.nextInt();
		dijkstra(n,source);
		System.out.println("Shortest paths from "+source+" to other vertices are : ");
		for(int i=1;i<=n;i++)
			if(i!=source)
				System.out.println(source+" ---> "+i+" = "+dist[i]);
	}
	public static void dijkstra(int n,int source)
	{
		int flag[]=new int[n+1];
		int minpos=1;
		for(int i=1;i<=n;i++)
		{
			flag[i]=0;
			dist[i]=cost[source][i];
		}
		int c=1;
		while(c<n)
		{
			int min=999;
			for(int i=1;i<=n;i++)
				if(i!=source)
					if(dist[i]<min&&flag[i]!=1)
					{
						min=dist[i];
						minpos=i;
					}
			flag[minpos]=1;
			c++;
			for(int i=1;i<=n;i++)
				if(i!=source)
					if(dist[minpos]+cost[minpos][i]<dist[i]&&flag[i]!=1)
						dist[i]=dist[minpos]+cost[minpos][i];
		}
	}
}