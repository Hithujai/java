	import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n = 5;  
	        int sum = 0;  
	        
	        
	        System.out.println("---------------------");
	        System.out.println("  Number  Factorial  ");
	        System.out.println("---------------------");
	        
	        
	        for (int i = 1; i <= n; i++) {
	            int factorial = 1;
	            for (int j = 1; j <= i; j++) {
	                factorial *= j;
	            }
	            System.out.printf("    %-2d        %-3d%n", i, factorial);
	            sum += factorial;
	        }
	        
	         
	        System.out.println("---------------------");
	        System.out.printf("     Sum  = %-4d%n", sum);
	        System.out.println("---------------------");
	    }


	}
