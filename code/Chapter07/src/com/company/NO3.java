package stringsnarrays;

public class NO3 {

	public static void main(String[] args) {
		
		
		wordEnds("abcXY123XYijk", "12");
		
	}

	public static String wordEnds (String str, String word) {
		
		//1. procurar XY
		//2. pegar anterior ao X
		//3. pegar depois de Y
		//abcXY123XYijk 
		
		char[] test = new char[str.length()]; 
		String end = " ";
		
		for (int i = 0; i < str.length(); i++) {
			//System.out.println("str[" + (i) + "] = " + (str.charAt(i)));
			
			test[i] = str.charAt(i);
			
			if(str.charAt(i) == word.charAt(0))
			{
				test[i] = ' ';
				end += str.charAt(i - 1);
			}
			
			if(str.charAt(i) == word.charAt(1))
			{
				test[i] = ' ';
				end += str.charAt(i + 1);

			}
			
		}
		
			//System.out.println("test[" + (i) + "] = " + (test[i]));
			 System.out.println("end = " + (end));
		
		
		
		return "";
	}

}
