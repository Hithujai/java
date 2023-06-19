import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter item number: ");
	        int itemNo = s.nextInt();
	        System.out.println("Enter item name: ");
	        String itemName = s.next();
	        System.out.println("Enter rate: ");
	        double rate = s.nextDouble();
	        System.out.println("Enter quantity: ");
	        int quantity = s.nextInt();
	        double price = rate * quantity;
	        double discount = 0;
	        if (price >= 1000 && price < 2000) 
	        {
	            discount = 0.1 * price;
	        } else if (price >= 2000 && price < 3000)
	        {
	            discount = 0.15 * price;
	        } else if (price >= 3000 && price < 5000)
	        {
	            discount = 0.2 * price;
	        } else if (price >= 5000) 
	        {
	            discount = 0.25 * price;
	        }
	        double netPrice = price - discount;
	        System.out.println("Item number: " + itemNo);
	        System.out.println("Item name: " + itemName);
	        System.out.println("Price: " + price);
	        System.out.println("Discount: " + discount);
	        System.out.println("Net price: " + netPrice);
	}

}
