import java.util.Scanner;

public class CC02ReplaceVowelsInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type something here!");
		String s = sc.nextLine();
		String newString = replaceVowelsWithUnderscores(s);
		System.out.println(newString);
		
		
		

	}
	
	
	public static String replaceVowelsWithUnderscores(String s) {
		
		// Regular expression to match vowels (both uppercase and lowercase)
        String checkForVowels = "[aeiouAEIOU]";
        // Replace vowels with underscores
        String replacedString = s.replaceAll(checkForVowels, "_");
        return replacedString;
	}

}
