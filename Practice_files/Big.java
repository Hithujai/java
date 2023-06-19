import java.util.Scanner;

public class Big {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int a;
		 int b;
		 int c;
		 int Big;
		 System.out.println("Enter first number");
		 a=s.nextInt();
		 System.out.println("Enter second number");
		 b=s.nextInt();
		 System.out.println("Enter third number");
		 c=s.nextInt();
		  Big= c>(a>b?a:b)?c:((a>b)?a:b);
		 
         System.out.println("Big:"+Big);
	}

}





//using conditional operator