 abstract class Fruit {
     double price;

    public Fruit(double price) {
        this.price = price;
    }

    public abstract double cost();
}

class Apple extends Fruit {
     int quantity;

    public Apple(double price, int quantity) {
        super(price);
        this.quantity = quantity;
    }

    public double cost() {
        return price * quantity;
    }
}

class Mango extends Fruit {
     double weight;

    public Mango(double price, double weight) {
        super(price);
        this.weight = weight;
    }

    public double cost() {
        return price * weight;
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Apple apple = new Apple(90, 5);
        Mango mango = new Mango(50, 0.5);

        System.out.println("Total cost of apples: Rs" + apple.cost());
        System.out.println("Total cost of mangoes: Rs" + mango.cost());
    }
}
	 

	 