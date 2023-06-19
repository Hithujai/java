
public class table {

	public static void main(String[] args) {
		System.out.println("Printing multiplication table start");
		for(int i = 1; i<11; i++)
		{
			for(int j=1; j<=10; j++)
			{
			System.out.println(i+ "*"+ j+ "="+ i*j);
			}
			System.out.println("Multiplication table of "+ i+ " completed");
		}

	}

}
