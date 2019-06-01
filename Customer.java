package ext;
import java.util.*;
public class Customer {
	
	public String read()
	{
		Scanner in = new Scanner(System.in);
		String str = in.next();
		if(!str.startsWith("<") || !str.endsWith(">"))
		{
			System.out.println("input in correct format");
			System.exit(0);
		}
		
		
		return str;
		
	}
	
	public void disp(String data)
	{
		String s = data.substring(0,data.length());
		StringTokenizer token = new StringTokenizer(s,"<,/>");
		String finalstr = null;
		
		while(token.hasMoreTokens())
		{
			if(finalstr == null)
			{
				finalstr = token.nextToken();
			}
			else
			{
				finalstr = finalstr + "," + token.nextToken();
			}
		}
		
		System.out.println("result = "+"<"+finalstr+">");
		
	}
	
	public static void main(String args[])
	{
		Customer c = new Customer();
		String s = c.read();
		c.disp(s);
	}
}
