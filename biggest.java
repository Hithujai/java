import java.util.Scanner;

public class biggest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		int biggest;
	System.out.println("Enter first number");
	   a=s.nextInt();
	   System.out.println("Enter second number");
	   b=s.nextInt();
	   System.out.println("Enter third number");
	   c=s.nextInt();
	   biggest=c>(a>b?a:b)?c:((a>b)?a:b);
	   System.out.println("The biggest number is:"+biggest);
	   
	   
	}

}
