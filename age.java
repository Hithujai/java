import java.util.Scanner;
public class age {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		if (age>=18)
			System.out.println("major");
		else
			if (age < 18 && age >0)
				System.out.println("minor");
			else
				System.out.println("invalid");
	}

}
		


