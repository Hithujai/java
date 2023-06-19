import java.util.Scanner;
public class MiniPrograms {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Program 1: Say Hello
		        System.out.print("Enter your full name: ");
		        String fullName = scanner.nextLine();
		        System.out.println("Hello, " + fullName + "!");
		        System.out.println("----------");

		        // Program 2: Add Five Numbers
		        System.out.println("Enter five numbers:");
		        double sum = 0;
		        for (int i = 1; i <= 5; i++) {
		            System.out.print("Number " + i + ": ");
		            double num = scanner.nextDouble();
		            sum += num;
		            System.out.println("Sum: " + sum);
		        }
		        System.out.println("----------");

		        // Program 3: Even or Odd
		        System.out.print("Enter an integer: ");
		        int num = scanner.nextInt();
		        if (num % 2 == 0) {
		            System.out.println(num + " is even");
		        } else {
		            System.out.println(num + " is odd");
		        }
		        System.out.println("----------");

		        // Program 4: Prime or Composite
		        System.out.print("Enter a positive integer: ");
		        int n = scanner.nextInt();
		        if (n == 1) {
		            System.out.println(1);
		        } else {
		            boolean isPrime = true;
		            for (int i = 2; i <= Math.sqrt(n); i++) {
		                if (n % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		            if (isPrime) {
		                System.out.println(n + " is prime");
		            } else {
		                System.out.println(n + " is composite");
		            }
		        }
		        System.out.println("----------");

		        // Program 5: Convert Seconds to Time
		        System.out.print("Enter number of seconds: ");
		        int seconds = scanner.nextInt();
		        int hours = seconds / 3600;
		        int minutes = (seconds % 3600) / 60;
		        seconds = seconds % 60;
		        System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);
		        System.out.println("----------");

		        // Program 6: Say Goodbye
		        System.out.println("Goodbye, " + fullName + "!");
		    }
		
	}


