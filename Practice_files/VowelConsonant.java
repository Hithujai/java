import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the character");
		 String ch;
		 ch = s.next();
		 switch(ch)
		 {
		 case "a": System.out.println("Vowel");break;
		 case "e": System.out.println("Vowel");break;
		 case "i": System.out.println("Vowel");break;
		 case "o": System.out.println("Vowel");break;
		 case "u": System.out.println("Vowel");break;
		 default: System.out.println("Consonant");
		 
		 
		 }
		 
	}

}
