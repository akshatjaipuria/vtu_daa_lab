package ext;
import java.util.*;
public class StackMethods {

	int top;
	int max;
	int stack[];
	
	StackMethods(int size)
	{
		max = size;
		top = -1;
		stack = new int[size];
	}
	
	void push(int ele)
	{
		if(top== max-1)
		{
			System.out.println("stack overflow");
		}
		else
		{
			stack[++top] = ele;
		}
	}
	
	public int pop()
	{
		int ele;
		if(top==-1)
		{
			System.out.println("stack underflow");
			return -1;
		}
		else 
		{
			ele = stack[top--];
		}
		return ele;
	}
	
	public void disp()
	{
		if(top!=-1)
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]);
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size");
		int size = in.nextInt();
		StackMethods stk = new StackMethods(size);	
		int ch;
		do
		{
			
			System.out.println("1.push\n2.pop\n3.disp\n0.exit");
			System.out.println("enter your choice");
			ch = in.nextInt();
			switch(ch)
			{
			case 1 : System.out.println("enter ele to be pushed");
					 stk.push(in.nextInt());
					 break;
					 
			case 2 : int ele = stk.pop();
					 if(ele!=-1)
					 {
						 System.out.println("popped :"+ele);
					 }
					 break;
			case 3 : stk.disp();
					 break;
			default : ch = 0;
			}
		}while(ch!=0);
	}
}
