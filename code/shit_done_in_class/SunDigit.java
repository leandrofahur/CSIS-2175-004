//To find sum of digits of a number using recursion
package recusrion;

import java.util.Scanner;

public class SunDigit {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum1=sum(num);
		System.out.println("Sum of digits of "+n+" is "+sum1);

	}
static int sum(int x)
{
	if(x==0)
		return 0;
	else
		return(x%10+sum(x/10));
}
}
