package ext;
import java.util.*;
public class Exec {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a:");
		int a = in.nextInt();
		System.out.println("enter b:");
		int b = in.nextInt();
		
		try
		{
			int d = a/b;
			System.out.println("result = "+d);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception occured");
		}
	}
}
