package projects;

abstract class Fruit {
		  abstract void flavour();
		  public void eat() {
		    System.out.println("I like to eat apple.");
		  }
		}
		class Apple extends Fruit {
		  //implementation of abstract method.
		  public void flavour() {
		    System.out.println("Apples might be sweet and sour.");
		  }
		}	
public class Abstraction {
		  public static void main(String[] args) {
		    //create an object of Apple class.
		    Apple a1 = new Apple();
		    a1.eat();
		    a1.flavour();
		  }
		}