import java.util.Scanner;

public class VowelConsonantWordCount {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a line of text:");
        String text = s.nextLine();
        
        int vowelCount = 0;
        int consonantCount = 0;
        int wordCount = 1;  
        
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if (Character.isLetter(ch))
            {
                if (isVowel(ch))
                {
                    vowelCount++;
                } 
                else
                {
                    consonantCount++;
                }
            } 
                  else if (ch == ' ')
                  {
                wordCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of words: " + wordCount);
        
    }
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}