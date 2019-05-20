import java.util.*;
public class Hamiltonian
{
	static int x[]=new int[10];
	public static void main(String args[])
	{
		int adj[][]=new int[10][10];
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter the no. of vertices : ");
		int n=sn.nextInt();
		System.out.println("Enter the 0/1 Adjacency matrix : ");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
			{
				adj[i][j]=sn.nextInt();
				x[i]=0;
			}
		x[1]=1;
		System.out.println("Hamiltonian Cycles : ");
		hamiltonian(adj,n,2);
	}
	static void hamiltonian(int adj[][],int n,int k)
	{
		while(true)
		{
			nextval(adj,n,k);
			if(x[k]==0)
				return;
			if(k==n)
			{
				for(int i=1;i<=n;i++)
				System.out.print(x[i]+" -> ");
				System.out.println(x[1]);
			}
			else
				hamiltonian(adj,n,k+1);
		}
	}
	static void nextval(int adj[][],int n,int k)
	{
		int i;
		while(true)
		{
			x[k]=(x[k]+1)%(n+1);
			if(x[k]==0)
				return;
			if(adj[x[k-1]][x[k]]==1)
			{
				for(i=1;i<k;i++)
					if(x[i]==x[k])
						break;
				if(i==k)
					if((k<n)||((k==n)&&(adj[x[n]][x[1]]==1)))
						return;
			}
		}
	}
}