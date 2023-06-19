import java.util.Scanner;
public class Bigthree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int Big;
		if(n1 > n2 && n1 > n3 )
			System.out.println("Big:" +n1);
		else
			if (n2 > n3)
			System.out.println("Big:" +n2);
			else
				System.out.println("Big:" +n3);
		 
	}

}



// using Nested if statement