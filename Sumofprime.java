
public class Sumofprime {

	public static void main(String[] args) {

		int sum = 0;
	      
	      for (int i = 2; i <= 100; i++)
	      {
	         int n = 0;
	         
	         for (int j = 2; j <= i/2; j++)
	         {
	            if (i % j == 0)
	            {
	               n++;
	               break;
	            }
	         }
	         
	         if (n == 0)
	         {
	            sum = sum+ i;
	         }
	      }
	      
	      System.out.println("The sum of prime numbers from 2 to 100 is: " + sum);
	}
}
