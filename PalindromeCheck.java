
  import java.util.Scanner;

		public class PalindromeCheck {
		    
		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        
		        System.out.println("Enter a string:");
		        String str = s.nextLine();
		        
		        if (isPalindrome(str)) {
		            System.out.println(str + " is a palindrome.");
		        } else {
		            System.out.println(str + " is not a palindrome.");
		        }
		        
		    }
		    
		    public static boolean isPalindrome(String str) {
		        StringBuilder sb = new StringBuilder(str);
		        sb.reverse();
		        return str.equals(sb.toString());
		    }

	}

