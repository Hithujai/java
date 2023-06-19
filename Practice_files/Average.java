import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Enter roll number");
		 int rollNum = s.nextInt();
		 System.out.println("Enter name");
		 String name = s.next();
		 System.out.println(" Enter marks in 3 subject");
		 double marks1 = s.nextDouble();
		 double marks2 = s.nextDouble();
		 double marks3 = s.nextDouble();  
		 double total = marks1+marks2+marks3;
		 double avg = total/3;
		 System.out.println("Roll NUmber:" +rollNum);
		 System.out.println("Name:"+name);
		 System.out.println("Total:"+total);
		 System.out.println("Average:"+avg);
		  
		

	}

}
