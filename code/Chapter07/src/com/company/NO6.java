package stringsnarrays;

public class NO6 {

	public static void main(String[] args) {
		
		String phrase = "A tia cocota gosta de porquinho";
		int[] max = consString(phrase);
		for(int i = 0; i < max.length; i++) {
			if(i == 0) {
				System.out.println("a: " + (max[i]));	
			}
			if(i == 1) {
				System.out.println("e: " + (max[i]));
			}
			if(i == 2) {
				System.out.println("i: " + (max[i]));
			}
			if(i == 3) {
				System.out.println("o: " + (max[i]));
			}
			if(i == 4) {
				System.out.println("u: " + (max[i]));
			}
			
		}	
		
		int index = 0;
		int value = 0;
		
		for (int j = 0; j < max.length; j++)
			
		{
			if (max[j] >= value) {
				value = max[j];
				index = j;
			}
			
		}
		
		System.out.println(value + " " + index);
	}
	
	
	
	//1. Encontrar vogais na frase/deletar consoantes
	//2. Somar quantidade de vogais que sobraram na frase
	//3. Encontrar qual vogal da maior quantidade
	
	public static int[] consString(String phrase)
	{
		int[] vogals = {0,0,0,0,0}; // {a,e,i,o,u}
		String onlyVogals = "";

		
		for (int i = 0; i < phrase.length(); i++)
		{
			if(phrase.charAt(i) == 'a') {
				vogals[0]++;
				onlyVogals += phrase.charAt(i);
				
			}
			
			if(phrase.charAt(i) == 'e') {
				vogals[1]++;
				onlyVogals += phrase.charAt(i);

			}
			
			if(phrase.charAt(i) == 'i') {
				vogals[2]++;
				onlyVogals += phrase.charAt(i);

			}
			
			if(phrase.charAt(i) == 'o') {
				vogals[3]++;
				onlyVogals += phrase.charAt(i);

			}
			
			if(phrase.charAt(i) == 'u') {
				vogals[4]++;
				onlyVogals += phrase.charAt(i);

			}
		}
		System.out.println(onlyVogals);
		return vogals;
	}
}
