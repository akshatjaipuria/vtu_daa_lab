package ext;
import java.util.*;
public class Test {
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		System.out.println("enter no. of staffs");
		int n = x.nextInt();
		Staff s[] = new Staff[n];
		Teaching t[] = new Teaching[n];
		Technical te[] = new Technical[n];
		Contract c[] = new Contract[n];
		
		for(int i=0;i<n;i++)
		{
			s[i] = new Staff();
			t[i] = new Teaching();
			te[i] = new Technical();
			c[i] = new Contract();
		}
		                   
		for(int i =0;i<n;i++)
		{
			s[i].getdetails();
			t[i].getTdetails();
			te[i].getTEdetails();
			c[i].getCdetails();
		}
		
		for(int i =0;i<n;i++)
		{
			s[i].putdetails();
			t[i].putTdetails();
			te[i].putTEdetails();
			c[i].putCdetails();
		}
	}
}

class Staff
{
	String name;
	
	public void getdetails()
	{
		Scanner x = new Scanner(System.in);
		System.out.println("enter name");
		name = x.next();
	}
	
	public void putdetails()
	{
		System.out.println("name = "+name);
	}
}

class Teaching extends Staff
{
	String publication;
	
	public void getTdetails()
	{
		Scanner x = new Scanner(System.in);
		System.out.println("enter publication");
		publication = x.next();
	}
	
	public void putTdetails()
	{
		System.out.println("publication = "+publication);
	}
}

class Technical extends Staff
{
	String dep;
	
	public void getTEdetails()
	{
		Scanner x = new Scanner(System.in);
		System.out.println("enter department");
		dep = x.next();
	}
	
	public void putTEdetails()
	{
		System.out.println("department = "+dep);
	}
}

class Contract extends Staff
{
	String period;
	
	public void getCdetails()
	{
		Scanner x = new Scanner(System.in);
		System.out.println("enter period");
		period = x.next();
	}
	
	public void putCdetails()
	{
		System.out.println("period = "+period);
	}
}