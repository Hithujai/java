
public class evenodd {

	public static void main(String[] args) {
		 
		 int n = 1;
	        int sumEven = 0;
	        int sumOdd = 0;
	        
	        while (n <= 100)
	        {
	            if (n % 2 == 0) { 
	                sumEven += n;
	            }
	            else
	            { 
	                sumOdd += n;
	            }
	            n++;
	        }
	        
	        System.out.println("Sum of even numbers from 1 to 100: " + sumEven);
	        System.out.println("Sum of odd numbers from 1 to 100: " + sumOdd);
	}
}



