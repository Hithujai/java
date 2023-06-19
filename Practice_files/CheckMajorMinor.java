import java.util.Scanner;

public class CheckMajorMinor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		 int age = s.nextInt();
		 if (age >=18 )
			 System.out.println("Major");
		 
		 else
			 
			 if(age<18 && age>0)
				 
			 System.out.println("Minor");
		 
			 else
				 System.out.println("Invalid Age");
	}

}
