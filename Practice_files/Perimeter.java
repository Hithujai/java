import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 double a;
		 double P;
		 System.out.println("Enter the side of Square");
		 a= s.nextDouble();
		 P = 4*a;
		 System.out.println("Perimeter of Square:"+P);
	}

}
