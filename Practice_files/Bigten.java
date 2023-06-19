import java.util.Scanner;

public class Bigten {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int n,i=1,big=0;
	 while(i<=10)
	 {
		 System.out.println("Enter the number");
		 n = s.nextInt();
		 if(n>big)
			 big=n;
		 i++;
	 }
        System.out.println("Big ="+big);
	}

}
