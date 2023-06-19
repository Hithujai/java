import java.util.*;

public class Bank {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int bal,amt,ch;
		 System.out.println(" Enter Current Balance");
		 bal=s.nextInt();
		 do
		 {
			 System.out.println("1.Deposite");
			 System.out.println("2.Withdrawl");
			 System.out.println("3.Display Balance");
			 System.out.println("4.Exit");
			 System.out.println("Enter your choice");
			 ch=s.nextInt();
			 switch(ch)
			 {
				 case 1:System.out.println("Enter the amount to deposite");
				 amt=s.nextInt();
				 bal=bal+amt;break;
				 case 2:System.out.println("Enter the amount to withdrawl");
				 amt=s.nextInt();
				 if(amt>bal)
					 System.out.println("Insufficient Balance");
				 else
					 bal=bal-amt;break;
				 case 3:System.out.println("Current Balance="+bal);break;
				 case 4:System.out.println("Thank you for Banking");break;
				 default:System.out.println("Invalid Choice");
			 }
				 
			 } while(ch!=4);
		 }

	}

}
