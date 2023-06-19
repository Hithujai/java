
 public class Rectangle {
     int length;
    int breadth;

    
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

     
    public int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
       
        Rectangle rect = new Rectangle(5, 3);
 
        int area = rect.area();
        System.out.println("Area of rectangle is: " + area);
    }
				 
				 }

