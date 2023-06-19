 public class Student {
     int rollNum;
     String studName;
     int mark1;
     int mark2;
     int mark3;
     int totalMarks;

    
    public Student(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        calculateTotal();  
    }
 
    private void calculateTotal() {
        this.totalMarks = mark1 + mark2 + mark3;
    }

     
    public void displayStudDetails() {
        System.out.println("Roll Number: " + this.rollNum);
        System.out.println("Student Name: " + this.studName);
        System.out.println("Total Marks: " + this.totalMarks);
    }

 
    public static void main(String[] args) {
        
        Student student = new Student(101, "Rahul", 80, 90, 85);
 
        student.displayStudDetails();
    }
}