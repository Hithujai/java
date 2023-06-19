import java.util.Scanner;

public class SumTen {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int n,i=1,sum=0;
	 while(i<=10)
	 {
		 System.out.println("Enter the number");
		 n=s.nextInt();
		 sum=sum+n;
		 i++;
	 }
	 System.out.println("Sum = "+sum);
		 }

}
