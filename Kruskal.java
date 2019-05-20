import java.util.*;
public class Kruskal
{
	static int parent[]=new int[10];
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
		kruskal(n);
	}
	public static void kruskal(int n)
	{
		int c=1,sum=0;
		while(c<n)
		{
			int u=0,v=0,i=0,j=0;
			int min=999;
			for(i=1;i<=n;i++)
				for(j=1;j<=n;j++)
					if(cost[i][j]<min&&i!=j)
					{
						min=cost[i][j];
						u=i;
						v=j;
					}
			i=find(u);
			j=find(v);
			if(i!=j)
			{
				union(i,j);
				sum+=cost[u][v];
				System.out.println("(" + u + "," + v + ")" + "=" + cost[u][v]);
				c++;
			}
			cost[u][v]=cost[v][u]=999;
		}
		System.out.println("Minimum Cost: "+sum);
	}
	static int find(int p)
	{
		while(parent[p]!=0)
			p=parent[p];
		return p;
	}
	static void union(int i,int j)
	{
		if(i<j)
			parent[i]=j;
		else
			parent[j]=i;
	}
}