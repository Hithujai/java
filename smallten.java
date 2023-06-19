
import java.util.Scanner;

public class smallten {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,i=1,small=0;
			System.out.println("Enter a Number");
			while (i <= 10)
			{
			n = s.nextInt();
			if (i==1)
			{
				small = n;
			}
			else if (n<small)
			{
				small = n;
			}
			i=i+1;
		}
		System.out.println("Small = "+small);
	}

}
