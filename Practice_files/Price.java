import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int itemNum;
		 String itemName;
		 double rate;
		 double quantity;
		 double Price;
		 System.out.println("Enter Item Number");
		 itemNum= s.nextInt();
		 System.out.println("Enter Item Name");
		 itemName = s.next();
		 System.out.println("Enter rate");
		 rate=s.nextDouble();
		 System.out.println("Enter Quantity");
		 quantity=s.nextDouble();
		  Price = rate*quantity;
		  System.out.println("Price:"+Price);

	}

}
