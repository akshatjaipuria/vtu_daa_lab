package ext;
import java.util.*;
public class Multi {
	
	public static void main(String args[])
	{
		First f = new First();
		f.start();
	}
	
}

class First extends Thread
{
	public void run()
	{
		try
		{
			Random rand = new Random();
			for(int i=0;i<5;i++)
			{
				int n = rand.nextInt(10);
				Thread  t1 = new Thread(new Second(n));
				t1.start();
				Thread t2 = new Thread(new Third(n));
				t2.start();
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("thread not created");
		}
		
	}
	
}

class Second implements Runnable
{
	int num;
	Second(int num)
	{
		this.num = num;
	}
	public void run()
	{
		System.out.println("sq is:" + num*num);
	}
}

class Third implements Runnable
{
	int num;
	Third(int num)
	{
		this.num = num;
	}
	public void run()
	{
		System.out.println("cube is:" + num*num*num);
	}
}