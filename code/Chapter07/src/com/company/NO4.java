package stringsnarrays;

public class NO4 {

	public static void main(String[] args) {
	
	int[] nums1 = {1,2,3};
	int[] nums2 = {2,3,5};
	
	
	System.out.println(matchUp(nums1, nums2));


	}
	
	
	public static int matchUp(int[] nums1, int[] nums2) {
		
		//1. comparar os mesmos indices de cada array
		//2. ver se tem a diferença de 2 ou menos
		
		int count = 0;
		
		for(int i = 0; i < nums1.length; i++) {
			
			if(Math.abs(nums1[i]-nums2[i]) <= 2)
				
			{
			   count++;	
			}
			
		}
		
		return count;
	}
	
}
