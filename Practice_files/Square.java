import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 double a;
		 double area;
		 System.out.println("Enter the side of Square");
		 a= s.nextDouble();
		 area = a*a;
      System.out.println("Area of Square:"+area);
	}

}
