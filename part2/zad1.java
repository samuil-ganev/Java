package part2;

public class zad1 {
	
	public static String clearString(String word) {
		
		String w = "";
		
		for (int i=0;i<word.length();++i) {
			
			if (word.charAt(i) >= 65 && word.charAt(i) <= 90)
				w += word.charAt(i);
			
		}
		
		return w;
		
	}
	
	static boolean t = false;
	
	private static void genPerm(String newWord, String remainingPart, String word2) {
        
		if (remainingPart.length() == 0 && newWord.equals(word2))
            t = true;

		for (int i=0;i<remainingPart.length();++i) {
			
			newWord += remainingPart.charAt(i);
			remainingPart = remainingPart.substring(0, i) 
					+ remainingPart.substring(i + 1);
			genPerm(newWord, remainingPart, word2);
    
		}

	}

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String word1, word2;
		
		word1 = clearString(sc.nextLine().toLowerCase());
		word2 = clearString(sc.nextLine().toLowerCase());
		
		genPerm("", word1, word2);
		
		if (t) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}
		
		sc.close();

	}

}
