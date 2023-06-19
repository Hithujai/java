 public class MyClass {
    private static int numInstances = 0;
    
    public MyClass() {
        numInstances++;
    }
    
    public static int getNumInstances() {
        return numInstances;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        
        int numInstances = MyClass.getNumInstances();
        System.out.println("Number of instances created: " + numInstances);
    }
 }