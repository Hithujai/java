 
public class Array {

	public static void main(String[] args) {
		  
		 int[] n = {5, 8, 6, 4, 7};
	        int max1 = n[0];
	        int max2 = n[0];
	        int min1 = n[0];
	        int min2 = n[0];
	        
	        for (int i = 0; i < n.length; i++)
	        {
	            if (n[i] > max1) 
	            {
	                max2 = max1;
	                max1 = n[i];
	            } else if (n[i] > max2 && n[i] != max1)
	            {
	                max2 = n[i];
	            }
	            if (n[i] < min1)
	            {
	                min2 = min1;
	                min1 = n[i];
	            } else if (n[i] < min2 && n[i] != min1) {
	                min2 = n[i];
	            }
	        }
	        
	        System.out.println("Big = " + max1);
	        System.out.println("Second Big = " + max2);
	        System.out.println("Small = " + min1);
	        System.out.println("Second Small = " + min2);
	}
}


