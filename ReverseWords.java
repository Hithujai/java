 import java.util.Scanner;

public class ReverseWords {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = s.nextLine();
        
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String word : words)
        {
            sb.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        
        System.out.println("Reversed words: " + sb.toString().trim());
        
    }
    
}