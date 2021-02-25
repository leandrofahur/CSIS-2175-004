package stringsnarrays;

public class NO2 {
	
	public static void main(String[] args)	{
		
		NO2 max = new NO2();
		
		int[] a = {1, 2, 3, 8, 9, 3, 2, 1};
		int[] b = {1, 2, 1, 4};
		int[] c = {7, 1, 2, 9, 7, 2, 1};
		
		System.out.println(max.maxMirror(a));
		System.out.println(max.maxMirror(b));
		System.out.println(max.maxMirror(c));
		
		
	}

	
	public int maxMirror(int[] nums)
	
	
	{
		int max = 0;
		
		for(int i = 0; i < nums.length; ++i) {
			
			for(int j = max + 1; j < nums.length - i + 1; ++j)
				
				for (int k = i; k < nums.length - j + 1; ++k)
					
				{ Boolean mir = true;
				
				for (int m = 0; mir && m < j; ++m)
					
					mir = nums[i + m] == nums [k + j - m - 1];
				
				 if (mir) max = j;
				 
				}
		}
		
		return max;
	}
	
}



	


/*	public int maxMirror(int[] nums) {
int max = 0;

for (int start = 0; start < nums.length; start++)
{
for(int begin = nums.length - 1; begin >= 0; begin--) {
	int size = 0;
	int i = start;
	int j = begin;
	
	while (i < nums.length && j >= 0 && nums[i] == nums[j]) {
		size++;
		i++;
		j--;
	}
	
	max = Math.max(max, size);
}
}

return max;


}*/