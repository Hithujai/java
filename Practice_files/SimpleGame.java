import java.util.Scanner;
public class SimpleGame {


		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		public String convertTime(int seconds){
	        if (seconds < 0) {
	            return "-1:-1:-1";
	        }
	        int hours = seconds / 3600;
	        int minutes = (seconds % 3600) / 60;
	        int secs = seconds % 60;
	        return String.format("%d:%02d:%02d", hours, minutes, secs);
	    }
		public int digitsSum(int input){
	        if (input == 0) {
	            return 0;
	        }
	        int sum = 0;
	        while (input > 0) {
	            sum += input % 10;
	            input /= 10;
	        }
	        return sum;
	    }
		public static void main(String[] args) {
	        SimpleGame game = new SimpleGame();
	        
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        if (choice == 1) {
	            System.out.println("Enter a number of seconds:");
	            int seconds = sc.nextInt();
	            System.out.println(game.convertTime(seconds));
	        } else if (choice == 2) {
	            System.out.println("Enter a non-negative integer:");
	            int input = sc.nextInt();
	            System.out.println(game.digitsSum(input));
	        } else {
	            System.out.println("Invalid choice.");
	        }
	        
	        sc.close();
	    }   
	

	}


