import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the item number");
		 int itemNum=s.nextInt();
		 System.out.println("Enter item name");
		 String itemName=s.next();
		 System.out.println("Enter the rate");
		 double rate=s.nextDouble();
		 System.out.println("Enter the quantity");
		 double quantity=s.nextDouble();
		 double price;
		 price =rate*quantity;
		 double discount;
		 if(price>=1000 && price<2000)
			 discount=0.1*price;
		 else
			 if(price>=2000 && price<3000)
				 discount = 0.15*price;
		 
		 
	}

}
