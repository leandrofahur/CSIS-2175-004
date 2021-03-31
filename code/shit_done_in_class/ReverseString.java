//To reverse a string with and without recursion
package recusrion;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String s=sc.next();
		
		System.out.println("Enter the choice--1 for recusive and 2 for non recursive solution");
		
		int choice=sc.nextInt();
		
		if(choice==1)
			System.out.println("Reverse string without recursion "+strrev(s));
		else
			if(choice==2)
				System.out.println("Reverse String with recursion is "+strrevrev(s));
	}
	
	public static String strrev(String x)
	{
		char[] r=new char[100];
		int len=x.length();
		int count=0;
		for(int i=len-1;i>=0;i--)
			r[count++]=x.charAt(i);
		String rev=new String(r);
		return rev;
			
	}
	public static String strrevrev(String x)
	{
		//System.out.println("length= "+x.length());
		if(x.length()==1)
			return(x);
		else
		{
			//System.out.println("last character= "+x.substring(x.length()-1));
			return(x.substring(x.length()-1)+strrevrev(x.substring(0,x.length()-1)));
		}
			
		
	}
}
