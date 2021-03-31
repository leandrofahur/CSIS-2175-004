//To find largest element of an array with and without using recursion
package recusrion;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the fib number");
		
		int n=sc.nextInt();
		
		System.out.println("Enter the choice--1 for recusive and 2 for non recursive solution");
		
		int choice=sc.nextInt();
		
		if(choice==1)
			System.out.println(n+" fibonacci number is "+fib(n));
		else
			if(choice==2)
				System.out.println(n+" fibonacci number is "+fibrec(n));
	}
	
	public static int fib(int x)
	{
		int a=0,b=1,c=0;
		if(x==1)
			return (0);
		else
			if(x==2)
				return(1);
			else
			{
				for(int i=3;i<=x;i++)
				{
					c=a+b;
					a=b;
					b=c;
				}
				return (c);
			}
	}
	public static int fibrec(int x)
	{
		
		if(x==1)
			return (0);
		else
			if(x==2)
				return(1);
			else
			{
				return(fibrec(x-1)+fibrec(x-2));
			}
	}
}
