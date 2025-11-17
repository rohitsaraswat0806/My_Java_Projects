package Generic_Problem;

class Fruit {
 String name;

 Fruit(String name) {
     this.name = name;
 }

 public String toString() {
     return name;
 }
}

class Apple extends Fruit {
 Apple() {
     super("Apple");
 }
}

//Subclass Mango
class Mango extends Fruit {
 Mango() {
     super("Mango");
 }
}


class FruitBox<T extends Fruit> {
 private java.util.List<T> fruits = new java.util.ArrayList<>();

 public void add(T fruit) {
     fruits.add(fruit);
 }

 public void display() {
     System.out.println("FruitBox contains:");
     for (T f : fruits) {
         System.out.println("- " + f);
     }
 }
}

public class FruitTest {
 public static void main(String[] args) {
   
     FruitBox<Fruit> box1 = new FruitBox<>();
     box1.add(new Apple());
     box1.add(new Mango());
     box1.display();

   
     FruitBox<Apple> appleBox = new FruitBox<>();
     appleBox.add(new Apple());
     appleBox.display();

   
 }
}
