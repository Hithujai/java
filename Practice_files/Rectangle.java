 import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double length;
		 double breath;
		
		System.out.println("Enter the length of rectangle:");
		length = s.nextDouble();
		System.out.println("Enter the breath of the rectangle:");
		breath = s.nextDouble();
		double area = length*breath;
		System.out.println("Area of Rectangle:"+area);
		
	}

}
