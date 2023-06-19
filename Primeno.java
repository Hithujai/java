import java.util.Scanner;
public class Primeno {

	public static void main(String[] args) {
		 
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      int num = s.nextInt();
	      int  i, j=0;
	      
	      for(i=2; i<num; i++)
	      {
	         if(num/i*i == 0)
	         {
	            j++;
	            break;
	         }
	      }
	      
	      if(j==0)
	         System.out.println("It is a Prime Number.");
	      else
	         System.out.println("It is not a Prime Number.");
	   }
	}

