package stringsnarrays;

public class NO5 {

	public static void main(String[] args) {
		
		String phrase = "This is orange juice";
		String word = "juice";
		
		System.out.println(findOrange(phrase, word));
	}
	
	public static boolean findOrange(String phrase, String word)
	{
		//1. percorrer a frase pra achar o o
		//2. analisar letras depois do O pra ver se combina com o word
		String temp = "";
		int k = 0;
		
		for (int i = 0; i < phrase.length(); i++) {
			
			if(phrase.charAt(i) == word.charAt(0) || (k >= 1 && k < word.length())) {
				temp += phrase.charAt(i);
				k++;
			}
		
		}		
		
		for (int j = 0; j < word.length(); j++) {
			
			if (word.charAt(j) != temp.charAt(j)) {
				
				return false;
				
			}
		}
		
		return true;
	}

}

//orange
//word = "orange" O R A N ...
//word.charAt(0) = '0'
//word.charAt(1) = 'r'