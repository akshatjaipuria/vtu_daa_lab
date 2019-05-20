import java.util.*;
public class tsp
{
	final static int MAX=100;
	public static void main(String args[])
	{
		int cost[][]=new int[MAX][MAX];
		int tour[]=new int[MAX];
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter the no. of vertices : ");
		int n=sn.nextInt();
		System.out.println("Enter the cost matrix : ");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				cost[i][j]=sn.nextInt();
		for(int i=1;i<=n;i++)
			tour[i]=i;
		int min_cost=tsp_dp(cost,tour,1,n);
		System.out.println("Minimunm cost : "+min_cost+"\n\nTour : ");
		for(int i=1;i<=n+1;i++)
			System.out.print(tour[i]+" ");
	}
	public static int tsp_dp(int cost[][],int tour[],int start,int n)
	{
		int temp[]=new int[MAX];
		int mintour[]=new int[MAX];
		int mincost,ccost;
		if(start==n-1)
			return(cost[tour[n-1]][tour[n]]+cost[tour[n]][1]);
		mincost=999;
		for(int i=start+1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				temp[j]=tour[j];
			temp[start+1]=tour[i];
			temp[i]=tour[start+1];
			if(cost[tour[start]][tour[i]]+(ccost=tsp_dp(cost,temp,start+1,n))<mincost)
			{
				mincost=ccost+cost[tour[start]][tour[i]];
				for(int k=1;k<=n;k++)
					mintour[k]=temp[k];
			}
		}
		int i;
		for(i=1;i<=n;i++)
			tour[i]=mintour[i];
		tour[i]=start;
		return mincost;
	}
}