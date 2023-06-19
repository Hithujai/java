import java.util.Scanner;

public class price {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter item Number");
		 int itemnum = s.nextInt();
		 System.out.println("Enter item Name");
		 String itemname = s.next();
		 System.out.println("Enter the rate");
		 double rate = s.nextDouble();
		 System.out.println("Enter the quantity");
		 int quantity = s.nextInt();
		 double Price = rate*quantity;
         System.out.println("Item Number = :"+item num);

		 
	}

}
