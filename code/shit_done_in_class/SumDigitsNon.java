//To find sum of digits of a number without using recursion
package recusrion;

import java.util.Scanner;

public class SumDigitsNon {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int num=n;
		int sum1=0;
		while(num>0) {
		int rem=num%10;
		num=num/10;
		sum1+=rem;
		}
		System.out.println("Sum of digits of "+n+" is "+sum1);

	}

}
