//Search an element in a sorted array using recursion
package recusrion;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("How many elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Which element to be searched");
		int e=sc.nextInt();
		
		int loc=BinaryS(ar,0,n-1,e);
		if(loc>=0)
			System.out.println("Element found at="+loc);
		else
			System.out.println("Element not in the list");
	}
	
public static int BinaryS(int ar[],int lb,int ub, int e)
{
	
		
		int mid=(lb+ub)/2;
		if(ar[mid]==e)
			return mid;
		else
			if(e<ar[mid])
				BinaryS(ar,lb,mid-1,e);
			else
				BinaryS(ar,mid+1,ub,e);
	return -1;
}
}