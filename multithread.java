import java.util.*;
 class first extends Thread
{
	public void run()
	{
		try
		{
			Random r=new Random();
			for(int i=0;i<5;i++)
			{
				int n=r.nextInt(100);
				System.out.println("Generated Number : "+n);
				Thread t1=new Thread(new second(n));
				t1.start();
				Thread t2=new Thread(new third(n));
				t2.start();
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class second implements Runnable
{
	int num;
	second(int num)
	{
		this.num=num;
	}
	public void run()
	{
		System.out.println("Square : "+(num*num));
	}
}
class third implements Runnable
{
	int num;
	third(int num)
	{
		this.num=num;
	}
	public void run()
	{
		System.out.println("Cube : "+(num*num*num));
	}
}
public class multithread
{
	public static void main(String args[])
	{
		first f=new first();
		f.start();
	}
}